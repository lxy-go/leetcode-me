package com.leetcode.geek.annotation.test;

import com.leetcode.geek.annotation.XYBean;

/**
 * 注解测试类
 *
 * @author lixiyan
 * @date 2021/5/10 3:54 PM
 */

public class AnnotationDemo1 {
    @XYBean(name="xy")
    public String hello(){
        return "test";
    }

    public static void main(String[] args) {

    }
}
