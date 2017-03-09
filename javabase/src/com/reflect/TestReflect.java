package com.reflect;

/**
 * Created by Administrator on 2017/3/9.
 */
public class TestReflect {
    public static void main(String[] args) throws ClassNotFoundException{
        Class<?>class1=Class.forName("com.reflect.TestReflect");
        Class<?>class2=new TestReflect().getClass();
        Class<?>class3=TestReflect.class;
        System.out.println("类名："+class1.getName());
        System.out.println("父类:"+class1.getSuperclass().getName());
        System.out.println("类名："+class2.getName());
        System.out.println("父类:"+class2.getSuperclass().getName());
        System.out.println("类名："+class3.getName());
        System.out.println("父类:"+class3.getSuperclass().getName());
        System.out.println("继承的接口:"+class1.getInterfaces().getClass().getName());
    }
}
