package com.leetcode.algorithms.solution100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * https://leetcode-cn.com/problems/3sum/
 */
public class Solution15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i =0;i<len;i++){
            if(nums[0] >0){return lists;}
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int cur = nums[i];
            int L = i+1;
            int R = len-1;
            while(L < R){
                int tmp = cur + nums[L] + nums[R];
                if(tmp == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(cur);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    while(L < R && nums[L+1] == nums[L]){
                        ++L;
                    }
                    while(L < R && nums[R-1] == nums[R]){
                        --R;
                    }
                    ++L;
                    --R;
                }else if(tmp<0){
                    L++;
                }else {
                    R--;
                }
            }

        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
