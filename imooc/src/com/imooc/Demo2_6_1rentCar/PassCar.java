package com.imooc.Demo2_6_1rentCar;
/*客车 子类*/
public class PassCar extends Car {
    public PassCar(String newCarName,int newMoney,int newSeatNum){
        super.carName=newCarName;
        super.money=newMoney;
        super.seatNum=newSeatNum;
    }
}
