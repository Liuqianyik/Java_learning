package com.imooc.Demo2_6_1rentCar_better;

import java.util.*;

public class DaDaRent {
    public static void main(String[] args) {
        System.out.println("欢迎使用答答租车系统：");
        System.out.println("您是否要租车：1是 0否");
        Scanner input = new Scanner(System.in);//接收输入信息
        int run= input.nextInt();

        if (run == 1){//首先要判断用户进来是要租车的才触发以下一系列操作
            System.out.println("您可租车的类型及其价目表：");
            System.out.println("序号\t汽车名称\t租金 \t载客\t载货");//在租金后面的\t后面又加了一个空格，这样才能显示的时候对齐
            Car[] cars = {//创建一个父类数组，包含子类各种车型及参数
                new Manned("奥迪A4",500,4,0),
                new Manned("马自达6",400,4,0),
                new Pickup("皮卡雪6",450,4,2),
                new Manned("金龙  ",800,20,0),
                new Truck("松花江",400,4,0),
                new Truck("依维柯",1000,0,20)
            };
            for(int i = 0;i<cars.length;i++){
                int number = i+1;//序号
                System.out.println(number+".\t"+cars[i].name+"\t"+cars[i].rent+" \t"+cars[i].seatCount+"\t"+ cars[i].load);
            }
            System.out.println("请输入您要租的汽车的数量：");
            int totalNum = input.nextInt();//保存租车的数量
            int totalrent = 0;//保存总租金
            int totalseatCount = 0;//保存总载客量
            double totalload = 0;//保存总载货量
            String[] carsname = new String [totalNum];//创建一个数组来保存车辆名字

            for(int j = 0;j<totalNum;j++){
                System.out.println("请输入第"+j+"辆车的序号：");
                Car[] choosecars = new Car[totalNum];//创建一个数组来保存选择的汽车
                choosecars[j] = cars[input.nextInt()-1];
                totalrent = totalrent+choosecars[j].rent;
                totalload = totalload+choosecars[j].load;
                carsname[j] = choosecars[j].name;
            }
            System.out.println("请输入租车天数：");
            int days = input.nextInt();
            int lastRent = totalrent*days;

            System.out.println("您的帐单：");
            System.out.println("***您选择的车辆有：");
            System.out.println(Arrays.toString(carsname));
            System.out.println("***共载人："+totalseatCount+"人");
            System.out.println("***共载货："+totalload+"吨");
            System.out.println("***租车总价格："+lastRent+"元");
        }else if(run == 0){
            System.out.println("欢迎下次光临！");
        }else{
            System.out.println("您的输入有误！");
        }
    }
}
