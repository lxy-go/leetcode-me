1. hive两个表join，过滤条件在on后边和where后边有哪些不同？

on: 生成临时表使用的方案，返回left表的全部元素
where: 临时表生成后，然后使用where
having: 聚合后的结果，过滤

2. 碰到哪些问题，怎么解决的？hive做了哪些优化，优化后有哪些不同？

背景，在广告计算实验数据，存在数据倾斜：

参数调优
-- MapJoin机制
set hive.auto.convert.join=true;
-- 参数控制在同一个sql中的不同的job是否可以同时运行
set hive.exec.parallel=true;
-- 输出压缩
set hive.exec.compress.output=true;
-- 超时时间
set mapred.task.timeout=36000000;

代码调优

- 空值处理
- 密集key
- 中间表with

3. 大表join大表的解决思路，数据分块，还有一个是离线数据怎么保证及时性；还做了个列转行然后行转列的题

1.发现倾斜key:shffle:distinct、groupByKey、reduceByKey、aggregateByKey、join、cogroup、repartition

2.1 预处理
场景：Java代码频繁调用Spark作业的场景，接口型

2.2 过滤少数导致倾斜的key
场景：压测

2.3 提高shuffle操作的并行度

场景：key分布问题，处理的任务少

2.4 两段聚合，加前缀字符串

场景：适合groupby join

2.5 将reduce join转换 map join

场景：小数据，广播变量

2.6 使用随机前缀和扩容RDD进行join

场景：适合join，扩容，UNION

- 加过滤

- 统计key样本
- 分开大key

4. 连续5天

select 
user_id,
date_sub(login_date,rank) as data_sub,
min(login_date) as start_date,
max(login_date) as end_date,
count(1) as continue_date 
from 
(select user_id,login_date,ROW_NUMBER() over(PARTITION BY user_id order by login_date) as rank from  login_log) a 
group by user_id,date_sub(login_date,rank) 

5. 新访问，留存指标如何计算
GAP

select t1.date,t2.gap,t2.retention_num,t2.retention_num/t1.dat0_Dau
as retention_ration from
#建立初始日活跃用户数量 的 虚表
(select date, count(distinct use_id) as day0_Dau from Table
where date='2020-03-01') as t1
left join
# 建立距离初始日1-7日的初始用户中的活跃用户留存数量 虚表
## 先建立初始用户的user_id 表
## 再给原表添加一列 gap 即距离初始日的天数 的虚表
## 再接上述两表拼接计算每日retention的值
(select t01.date,t02.gap,count(*) as retention_num from
(select date,user_id as uid01 from Table
where date='2020-03-01') t01
left join
(select user_id as uid02,datediff(date,'2020-03-01') as gap from Table where date between '2020-03-01' and '2020-03-08') t02
on t01.uid01=t02.uid02
group by t01.date,t02.gap) t2

on t1.date=t2.date
order by t1.date,t2.gap

6. select a, count(distinct b) num from A group by a ;  解析成MR操作

