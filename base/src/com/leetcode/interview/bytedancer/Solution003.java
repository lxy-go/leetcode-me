package com.leetcode.interview.bytedancer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 用List和Map实现LRU
 *
 * @author lixiyan
 * @date 2021/6/8 12:34 PM
 */
public class Solution003 {
    // 容量
    private int capacity;
    private LinkedList<Integer> list;
    private Map<Integer,Integer> cache;
    public Solution003(int capacity){
        this.capacity = capacity;
        this.cache =  new HashMap<>();
        this.list = new LinkedList<>();
    }
    //添加元素
    private void put(Integer key , Integer value){
        cache.put(key,value);
        if (!list.contains(key)){
            list.add(key);
        }
        afterPut(key);
    }

    private Integer get(Integer key){
        if (cache.containsKey(key)){
            afterGet(key);
            return cache.get(key);
        }else {
            return -1;
        }
    }

    private void afterGet(Integer key){
        list.remove(key);
        list.add(key);
    }

    private void afterPut(Integer key){
        if (cache.size() > capacity){
            Integer oldKey = list.getFirst();
            list.removeFirst();
            cache.remove(oldKey);
        }
    }


}
