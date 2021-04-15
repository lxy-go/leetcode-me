package com.leetcode.geek.array;

/**
 * 支持扩容的数组
 *
 * @author lixiyan
 * @date 2021/4/15 8:20 PM
 */
public class MyArray<T> {

    private static final int INIT_SIZE = 8;

    private Object[] objectsArray;

    private int size;


    public MyArray() {
        this.objectsArray = new Object[INIT_SIZE];
    }

    public MyArray(int size){
        if (size <= 0){
            throw new RuntimeException("数组大小为正整数");
        }
        if (size <= 8){
            size = INIT_SIZE;
        }
        this.objectsArray = new Object[size];
    }

    /**
     * 核心：扩容复制
     */
    private void setSize(int size){
        if (size <= 0){
            throw new RuntimeException("数组大小不能小于0");
        }
        if (size <= INIT_SIZE){
            throw new RuntimeException("数组大小不能小于原数组");
        }
        Object[] array = new Object[size];
        for (int i = 0; i< objectsArray.length; i++) {
            array[i] = objectsArray[i];
        }
        this.objectsArray = array;
    }

    public T get(int index){
        if (index < 0 || index > size){
            throw new RuntimeException("获取异常");
        }
        return (T)objectsArray[index];
    }

    public void add(T t){
        if (this.size > objectsArray.length){
            throw new RuntimeException("error");
        }
        if (this.size == objectsArray.length){
            // 扩容2倍
            setSize(2*objectsArray.length);
        }
        objectsArray[size++] = t;
    }

}
