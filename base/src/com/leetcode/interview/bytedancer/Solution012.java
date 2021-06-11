package com.leetcode.interview.bytedancer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 *
 * @author lixiyan
 * @date 2021/6/11 12:01 PM
 */
public class Solution012 {

    static class Node implements Comparator<Node> {
        public int value;
        public int arrayIdx;
        public int idx;

        public Node(){}

        public Node(int value,int arrayIdx,int idx){
            this.value = value;
            this.arrayIdx = arrayIdx;
            this.idx = idx;
        }

        @Override
        public int compare(Node n1, Node n2) {
            if(n1.value < n2.value){
                return 1;
            }else {
                return 0;
            }
        }
    }

    static Comparator<Node> cNode = new Comparator<Node>() {

        @Override
        public int compare(Node o1, Node o2) {
            return o1.value - o2.value;
        }
    };

    private static int[] mergeKSortedArrays(int[][] arrays){
        PriorityQueue<Node> q = new PriorityQueue<Node>(arrays.length+5,cNode);
        // 初始化 答案
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arrays.length; i++) {
            // 如果这个数组为空 则不用压入
            if(arrays[i].length == 0) {
                continue;
            }
            // arrays[i][0] 权值大小  i 在第i个数组   0 在该数组的0位置
            q.add(new Node(arrays[i][0], i, 0));
        }
        while(!q.isEmpty()) {
            // 取出队列中最小值
            Node point = q.poll();

            // 权值 ，所在数组的编号，在该数组的位置编号
            int value = point.value;
            int arrayIdx = point.arrayIdx;
            int idx = point.idx;

            //  更新答案数组
            ans.add(value);



            // 它已经是所在数组的最后一个元素了，这个数组的所有元素都已经处理完毕
            if(idx == arrays[arrayIdx].length - 1) {
                continue;
            } else {
                // 压入它下一个位置的新元素
                Node newPoint = new Node(arrays[arrayIdx][idx + 1], arrayIdx, idx + 1);
                q.add(newPoint);
            }
        }
        return ans.stream().mapToInt(Integer::valueOf).toArray();
    }


    public static void main(String[] args) {
        int[] a1 = new int[]{2,4,6};
        int[] a2 = new int[]{1,3,5};
        int[] a3 = new int[]{7,9,11};
        int[][] ar = new int[][]{a1,a2,a3};

        for (int i : mergeKSortedArrays(ar)) {
            System.out.println(i);
        }
    }
}
