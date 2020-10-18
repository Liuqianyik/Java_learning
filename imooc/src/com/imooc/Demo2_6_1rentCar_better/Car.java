package com.imooc.Demo2_6_1rentCar_better;
//车的父类
public class Car {
    String name;//车名
    int rent;//租金
    int seatCount;//座位数
    double load;//载货量

    public Car(String name,int rent,int seatCount,double load){
        this.name = name;
        this.rent = rent;
        this.seatCount = seatCount;
        this.load = load;
    }
}
