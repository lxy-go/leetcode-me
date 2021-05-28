package com.leetcode.algorithms.solution700;

import java.util.ArrayList;
import java.util.List;

/**
 * 统计二进制字符串中连续 1 和连续 0 数量相同的子字符串个数
 *
 * https://leetcode-cn.com/problems/count-binary-substrings/description/
 * @author lixiyan
 * @date 2021/5/28 3:00 PM
 */
public class Solution696 {

    /**
     * 字符串
     *
     */
    public static int countBinarySubstrings(String s) {
        List<Integer> counts = new ArrayList<Integer>();
        int ptr = 0,n = s.length();
        while(ptr < n){
          char c = s.charAt(ptr);
          int count =0;
          while(ptr < n && s.charAt(ptr) == c){
              ++ptr;
              ++count;
          }
          counts.add(count);
        }
        int ans = 0;
        for (int i = 1; i < counts.size(); ++i) {
            ans += Math.min(counts.get(i),counts.get(i-1));
        }
        return ans;
    }

    public static void main(String[] args) {
        // counts [2,3,1,2]
        System.out.println(countBinarySubstrings("00111011"));
    }
}
