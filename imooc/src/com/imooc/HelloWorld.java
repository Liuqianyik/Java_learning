package com.imooc;

public class HelloWorld {

    // 定义静态变量，保存班级名称
    static String className = "JAVA开发一班";

    public static void main(String[] args) {

        // 访问静态变量，输出班级名称
        System.out.println("通过类名访问className："+HelloWorld.className);

    }
}
