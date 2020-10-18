package com.imooc.Demo1_5_5;

import java.util.Scanner;

/*
功能：实现接收三个班级的各四名学员的成绩信息，然后计算每个班级学员平均分
知识点：二重循环，外层循环控制班级数量，内层循环控制学员数量
 */
public class Demo1_5_5 {
    public static void main(String[] args) {
        int classNum = 3; //班级数量
        int stuNum = 4; //每个班级学生数量
        int sum = 0;//每个班级成绩总和
        double avg = 0; //成绩平均分
        for(int i = 1;i<=classNum;i++){
            System.out.println("***请输入第"+i+"个班级的成绩***");
            sum = 0;
            for(int j = 1;j<=stuNum;j++){
                System.out.print("请输入第"+i+"个班中第"+j+"个学员的成绩:");
                int score = new Scanner(System.in).nextInt();
                System.out.println("学员成绩："+score);
                sum+=score;
            }
            avg=sum/stuNum;
            System.out.println("第"+i+"个班学员的平均成绩为："+avg);
        }
    }
}
