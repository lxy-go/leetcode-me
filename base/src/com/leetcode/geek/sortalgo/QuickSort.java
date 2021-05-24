package com.leetcode.geek.sortalgo;

/**
 * 快排
 *
 * @author lixiyan
 * @date 2021/5/24 5:24 PM
 */
public class QuickSort {

    private static void quickSort(int[] nums,int n){
        quickSortc(nums,0,n-1);
    }
    private static void quickSortc(int[] nums,int p,int r){
        if (p>=r){
            return;
        }
        int q = partition(nums, p, r);
//        if (q==3){return;}
        quickSortc(nums,p,q-1);
        quickSortc(nums,q+1,r);


    }

    private static int partition(int[] nums,int p,int r){
        int pivot = nums[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (nums[j] < pivot){
                swap(nums,i,j);
                i++;
            }
        }
        swap(nums,i,r);
        return i;

    }

    private static void swap(int[] nums,int p,int r){
        int tmp = nums[p];
        nums[p] = nums[r];
        nums[r] = tmp;
    }

    public static void main(String[] args) {

        int[] nums= new int[]{2,3,1,4,5};
        quickSort(nums,nums.length);
        for (int num : nums) {
            System.out.println(num);
        }

    }
}
