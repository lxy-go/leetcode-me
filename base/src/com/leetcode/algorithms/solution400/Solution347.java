package com.leetcode.algorithms.solution400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 出现频率最多的 k 个元素
 * <p>
 * https://leetcode-cn.com/problems/top-k-frequent-elements/description/
 *
 * @author lixiyan
 * @date 2021/5/12 5:52 PM
 */
public class Solution347 {

    /**
     * 桶排序
     */
    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyForNum = new HashMap();
        for (int num : nums) {
            frequencyForNum.put(num, frequencyForNum.getOrDefault(num, 0) + 1);
        }
        // 同的 标识 是出现频率 frequency，桶里装的 数bu
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (Integer key : frequencyForNum.keySet()) {
            Integer frequency = frequencyForNum.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        List<Integer> topK = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && topK.size()<k ;i--){
            if (buckets[i] == null) {
                continue;
            }
            if (buckets[i].size() <= (k-topK.size())){
                topK.addAll(buckets[i]);
            }else{
                topK.addAll(buckets[i].subList(0,k-topK.size()));
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = topK.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,2,2,3,4,4};
        int k =2;
        for (int i : topKFrequent(a, k)) {
            System.out.println(i);
        }
    }
}
