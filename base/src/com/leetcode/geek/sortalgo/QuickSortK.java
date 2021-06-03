package com.leetcode.geek.sortalgo;

/**
 * 快排
 *
 * @author lixiyan
 * @date 2021/5/24 5:24 PM
 */
public class QuickSortK {

    private static void quickSort(int[] nums,int n){
        quickSortC(nums,0,n-1);
    }

    private static void quickSortC(int[] nums,int p,int r){
        if (p >= r){
            return;
        }

        int q = partition(nums,p,r);
//        if (q==3){return;}
        quickSortC(nums,p,q-1);
        quickSortC(nums,q+1,r);
    }

    private static int partition(int[] nums,int p ,int r){
        int i = p;
        int pivot = nums[r];
        for (int j = p; j < r; j++) {
            if (nums[j] < pivot){
                swap(nums,i,j);
                i++;
            }

        }
        swap(nums,i,r);
        return  i;
    }

    private static void swap(int[] nums,int p,int q){
        int tmp = nums[q];
        nums[q] = nums[p];
        nums[p] = tmp;
    }


    public static void main(String[] args) {

        int[] nums= new int[]{2,3,1,4,5};
        quickSort(nums,nums.length);
        for (int num : nums) {
            System.out.println(num);
        }

    }
}
