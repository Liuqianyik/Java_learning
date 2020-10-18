package com.imooc.Demo2_6_1rentCar;
/*车 父类*/
public class Car {
    protected  String carName; //车名
    protected  int money; //价格
    protected  int seatNum; //座位数
    protected  double weigthNum; //载货量 直接用了double类型
    private  double toMoney=0; //总价格
    private  int toSeat=0; //总座位
    private  int toWeigth=0; //总载重
    private int day=1; //租车天数

    public Car(String newCarName,int newMoney,int newSeatNum,double NewWeigthNum) {
        this.carName=newCarName;
        this.money=newMoney;
        this.seatNum=newSeatNum;
        this.weigthNum=NewWeigthNum;
    }

    public Car() {
    }

    public String getCarName() {
        return carName;
    }

    public int getMoney() {
        return money;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public double getWeigthNum() {
        return weigthNum;
    }

    public double getToMoney() {
        return toMoney;
    }

    public int getToSeat() {
        return toSeat;
    }

    public int getToWeigth() {
        return toWeigth;
    }

    public int getDay() {
        return day;
    }

    public void show() {
        if(weigthNum<=0) {
            System.out.println("\t"+carName+"\t"+money+"元/天\t载人:"+seatNum+"人");
        }
        else if(seatNum<=0) {
            System.out.println("\t"+carName+"\t"+money+"元/天\t载货:"+weigthNum+"吨");
        }else {
            System.out.println("\t"+carName+"\t"+money+"元/天\t载人:"+seatNum+"人 载货:"+weigthNum+"吨");
        }
    }
}
