package com.leetcode.interview.bytedancer;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * 微信红包
 *
 * 真正的发红包算法里面每一次抢到红包金额的数学期望都是相等的，主要核心算法就是每一次红包的金额为当前的（总金额/红包个数*2
 比如总金额100元，分10个红包，那么第一个红包的随机区间为（0，20），它的期望为10，同理第二个红包的理论期望值也为10
 * @author lixiyan
 * @date 2021/6/10 12:01 PM
 */
public class Solution007 {

    private static void randBonus(Integer money,Integer num){
        Float totalMoney = Float.parseFloat(money.toString());
        if (num <1){
            return;
        }
        if (num == 1){
            System.out.println(totalMoney);
            return ;
        }
        if (num*0.01 > totalMoney){
            System.out.println("数据异常");
            return;
        }
        if (num*0.01 == totalMoney){
            for (int i = 0; i < num; i++) {
                System.out.println("第"+i+"个用户，抢到红包0.01");
            }
        }
        int i =0;
        while(i < num-1){
            int maxRange = (int)(totalMoney * 2 * 100 / (num - i));
//            System.out.println(maxRange);
            Float getMoney = (float)new Random().nextInt(maxRange-1)+1;
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            String getSmoney = decimalFormat.format(getMoney / 100);
            float getFmoney = Float.parseFloat(getSmoney);
            totalMoney -= getFmoney;
//            System.out.println("totalMoney:"+totalMoney);
            System.out.println("第"+(i+1)+"个用户抢到红包数是: "+getFmoney);
            i++;
        }
        System.out.println("第"+(num)+"个用户抢到红包数是："+new DecimalFormat("0.00").format(totalMoney));


    }

    public static void main(String[] args) {
        randBonus(10,10);
    }

}
