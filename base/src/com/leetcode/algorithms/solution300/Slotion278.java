package com.leetcode.algorithms.solution300;

/**
 * 278 寻找重复数
 *
 * https://leetcode-cn.com/problems/find-the-duplicate-number/description/
 * @author lixiyan
 * @date 2021/4/21 5:48 PM
 */
public class Slotion278 {


    public static int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4};
        System.out.println(findDuplicate(arr));

    }
}
