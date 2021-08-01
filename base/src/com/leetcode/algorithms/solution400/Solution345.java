package com.leetcode.algorithms.solution400;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 反转字符串中的元音字符
 * <p>
 * https://leetcode-cn.com/problems/reverse-vowels-of-a-string/description/
 *
 * @author lixiyan
 * @date 2021/5/4 9:16 AM
 */
public class Solution345 {

    private static Set<Character> vowel = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
            )
    );

    private static String reverseVowels(String s) {
       if (s == null){
           return null;
       }
       int i =0;
       int j = s.length()-1;
       char[] result = new char[s.length()];
        while (i<=j){
           Character ci = s.charAt(i);
           Character cj = s.charAt(j);
           if (!vowel.contains(ci)){
               result[i++] = ci;
           }else if(!vowel.contains(cj)){
               result[j--] = cj;
           }else {
               result[i++] = cj;
               result[j--] = ci;
           }
       }
       return new String(result);

    }


    public static void main(String[] args) {
        String a = "leetcode";
        System.out.println(reverseVowels(a));

    }
}
