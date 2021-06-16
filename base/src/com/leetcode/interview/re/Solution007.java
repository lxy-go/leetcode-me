package com.leetcode.interview.re;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * 微信红包
 *
 * @author lixiyan
 * @date 2021/6/16 11:58 AM
 */
public class Solution007 {
    private static void randBonus(Integer money,Integer num){
         float totalMoney = (float)(money);
        if (num ==1){
            System.out.println("抢到"+totalMoney+"元");
            return ;
        }
        if (num*0.01 > totalMoney){
            System.out.println("数据异常");
            return ;
        }else if (num*0.01 == totalMoney){
            for (int i = 0; i < num; i++) {
                System.out.println("第"+i+"个用户抢到红包是0.01元");
            }
        }else {
            int i = 0;
            float getMoney = 0.00F;
            while(i<num-1){
                totalMoney = totalMoney-getMoney;
                int maxRange = (int)totalMoney *100*2/(num-i);
                getMoney = (new Random().nextInt(maxRange-1)+1)/100;
                System.out.println("第"+(i+1)+"个用户抢到"+(new DecimalFormat("0.00").format(getMoney))+"元");
                i++;
            }
            System.out.println("第"+num+"个用户抢到"+new DecimalFormat("0.00").format(totalMoney));

        }

    }

    public static void main(String[] args) {
        randBonus(100,10);
    }
}
