package com.imooc.Demo2_6_1rentCar;
/*货车 子类*/
public class TruckCar extends Car {
    public TruckCar(String newCarName,int newMoney,double weigthNum){
        super.carName=newCarName;
        super.money=newMoney;
        super.weigthNum=weigthNum;
    }
}