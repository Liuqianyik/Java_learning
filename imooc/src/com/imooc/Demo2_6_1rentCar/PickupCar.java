package com.imooc.Demo2_6_1rentCar;
/*皮卡车 子类*/
public class PickupCar extends Car {
    public PickupCar(String newCarName,int newMoney,int newSeatNum,double weigthNum){
        super.carName=newCarName;
        super.money=newMoney;
        super.seatNum=newSeatNum;
        super.weigthNum=weigthNum;
    }
}