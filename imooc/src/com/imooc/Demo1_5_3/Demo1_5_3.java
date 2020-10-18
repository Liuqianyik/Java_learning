package com.imooc.Demo1_5_3;

import java.util.Scanner;

/*
使用Scanner工具类接收用户输入的信息
固定格式为：
String 变量 = new Scanner(System.in).next();
或者
int 变量 = new Scanner(System.in).nextInt();
 */
public class Demo1_5_3 {
    public static void main(String[] args) {
        /*
        int num = new Scanner(System.in).nextInt();
        System.out.println(num);
        */
        // 变量保存成绩
        System.out.print("请输入用户的初始分数:");  //print是输出之后不换行，println是输出之后换行
        int score = new Scanner(System.in).nextInt();
        // 变量保存加分次数
        int count = 0;
        //打印输出加分前成绩
        System.out.println("加分前成绩:"+score);
        // 只要成绩小于60，就循环执行加分操作，并统计加分次数
        while(score<60){
            score++;
            count++;}
        System.out.println("加分后成绩:"+score);
        System.out.println("共加了"+count+"次");
        //打印输出加分后成绩，以及加分次数
    }
}
