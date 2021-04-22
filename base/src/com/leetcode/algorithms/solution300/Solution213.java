package com.leetcode.algorithms.solution300;

/**
 * 强盗在环形街区抢劫
 * <p>
 * (1) 第一间房屋到最后第二间房屋 (0,n-2)
 * (2) 第二间房屋到最后一间房屋 (1,n-1)
 * https://leetcode-cn.com/problems/house-robber-ii/description/
 *
 * @author lixiyan
 * @date 2021/4/22 4:52 PM
 */
public class Solution213 {

    private static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        // 只有一家
        if (length == 1) {
            return nums[0];
        } else if
            // 只有二家，取一家
                (length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(robRange(nums,0,length-2),robRange(nums,1,length-1));

    }


    /**
     * 范围
     * first 上一步，second最新步
     */
    private static int robRange(int[] nums, int start, int end) {
        int first = nums[start], second = Math.max(nums[start], nums[start + 1]);
        // 因为前面有0-2的值，所以start+2
        for (int i = start + 2; i <= end; i++) {
            int tmp = second;
            second = Math.max(first+nums[i],second);
            first = tmp;
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {200, 3, 140, 20, 10};
        int rob = rob(arr);
        System.out.println(rob);
    }

}
