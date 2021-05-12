package com.leetcode.geek.annotation.test;

import com.leetcode.geek.annotation.XYBean;

import java.lang.reflect.Method;

/**
 * 反射测试
 *
 * @author lixiyan
 * @date 2021/5/10 4:22 PM
 */
public class AnnotationRef01 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        // 反射获取类和方法
        Class<?> clazz = Class.forName("com.leetcode.geek.annotation.test.AnnotationDemo1");
        Method hello = clazz.getMethod("hello");
        // 判断是否存在注解
        boolean classAnnotation = clazz.isAnnotationPresent(XYBean.class);
        boolean methodAnnotation = hello.isAnnotationPresent(XYBean.class);
        System.out.println("class注解： "+classAnnotation);
        System.out.println("method注解："+methodAnnotation);
        if (classAnnotation){
            XYBean classInfo = clazz.getAnnotation(XYBean.class);
            if (classInfo != null){
                System.out.println(classInfo);
                System.out.println("name: "+classInfo.name()+"  age: " +classInfo.age());
            }

        }
        if (methodAnnotation){
            XYBean helloInfo = hello.getAnnotation(XYBean.class);
            if (helloInfo != null){
                System.out.println(helloInfo);
                System.out.println("name: "+helloInfo.name()+"  age: " +helloInfo.age());
            }
        }
    }
}
