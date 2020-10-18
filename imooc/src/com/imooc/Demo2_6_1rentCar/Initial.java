package com.imooc.Demo2_6_1rentCar;
import java.util.*;//如果你要bai用java.util包中的类Scanner的话你就需要这样使用du

/*运行类*/

public class Initial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// 从键盘接收数据

        System.out.println("***欢迎使用答答租车系统***");

        System.out.println("您是否要租车？输入数字\t1是，2否"); //判断是否要租车

        Car carVa=new Car();

        int toSeat=carVa.getToSeat(); //定义车总座位数

        double toWeigth=carVa.getWeigthNum(); //定义值车总载重数

        double toMoney=carVa.getMoney(); //定义总价格

        int day=carVa.getDay();

        int carType=0; //定义选择的车序号

        int maxC=999; //定义最大租车数量



        for(int tf=3;tf>=0;tf--) {

            int confirmInt=input.nextInt(); //输入数字判断是否要租车

            if(confirmInt==1) {

                tf=-1; //结束外层租车需求循环判断 18行



                Car car[]={

                        new PassCar("奥迪A4",500,4),

                        new PassCar("马自达6",400,4),

                        new PassCar("金龙",800,20),

                        new PickupCar("皮卡雪6",450,4,2),

                        new TruckCar("松花江",400,4),

                        new TruckCar("依维柯",1000,20),

                };



                System.out.println("序号"+"\t"+"汽车名称"+"\t"+"租金"+"\t"+"容量");

                for(int c=0,d=1;c<car.length;c++,d++) { //显示租车列表

                    System.out.print(d+".");

                    car[c].show();

                }



                int carNum=3; //定义租车数量

                System.out.println("请输入您要租车的数量");

                for(int tfNum=3;tfNum>=0;tfNum--) { //循环最大租车数量

                    carNum=input.nextInt();

                    String carN[]=new String[carNum]; //定义数组,保存选择后的车辆-车名

                    int carS[]=new int[carNum]; //定义数组,保存选择后的车辆-座位数

                    double carW[]=new double[carNum]; //定义数组,保存选择后的车辆-载重数

                    List<String> listS = new ArrayList<String>();

                    List<String> listW = new ArrayList<String>();

                    if(carNum>0&&carNum<=maxC) { //判断租车数量.小于max=999, 进入选车循环

                        tfNum=-1;



                        for(int i=1,tfNo=3;i<=carNum;) {

                            System.out.println("请输入第"+i+"辆车的序号,输入"+"[ 0 ]"+"直接进入下一步租车天数界面");

                            carType=input.nextInt(); //选择车序号

                            if(carType<=car.length&&carType>0) { //如果输入的车序号小于车辆数据总长度

                                tfNo=3;

                                toMoney=toMoney+car[carType-1].getMoney(); //计算总价格

                                toSeat=toSeat+car[carType-1].getSeatNum(); //计算总座位/载人数

                                toWeigth=toWeigth+car[carType-1].getWeigthNum(); //计算总载重数

                                carS[i-1]=car[carType-1].getSeatNum(); //保存我们选择的车座位数为数组

                                carW[i-1]=car[carType-1].getWeigthNum();//保存我们选择的车载重为数组

                                carN[i-1]=car[carType-1].getCarName(); //保存我们选择的车名为数组

                                i++;

                                if(i<carNum) {

//显示租车列表

                                    System.out.println("序号"+"\t"+"汽车名称"+"\t"+"租金"+"\t"+"容量");

                                    for(int c=0,d=1;c<car.length;c++,d++) {

                                        System.out.print(d+".");

                                        car[c].show();

                                    }

                                }

                            }

                            else {

                                if(tfNo>0&&carType!=0) {

//显示租车列表

                                    System.out.println("序号"+"\t"+"汽车名称"+"\t"+"租金"+"\t"+"容量");

                                    for(int c=0,d=1;c<car.length;c++,d++) {

                                        System.out.print(d+".");

                                        car[c].show();

                                    }

                                    System.out.println();

                                    System.out.println("输入错误！此序号的车辆不存在,还可输入"+tfNo+"次。");

                                    tfNo--;

                                }

                                else if(tfNo<=0) {

                                    System.out.println("输入的租车数量,错误次数已达3次,退出租车界面");

                                    break;

                                }

                            }

//判断车辆完选择之后

                            if(i>carNum||carType==0) {



                                System.out.println("请输入租车天数:");

                                day=input.nextInt();

                                if(day>0) { //判断租车天数

                                    System.out.println("您的账单:");

                                    System.out.println("***可载人的车有:");

                                    for(int s=0;s<carN.length;s++) {

                                        if(!listS.contains(carN[s])) { //判断重复值

                                            if(carS[s]>0) { //判断座位数大于0

                                                listS.add(carN[s]); //加到list

                                            }

                                        }

                                    }

                                    System.out.print(listS); //输出去重复值后的车

                                    if(toSeat<=0) { //判断有没有选择客车

                                        System.out.println("无");

                                    }else {

                                        System.out.println("\t总载人:"+toSeat+"人");

                                    }

                                    System.out.println("***可载货的车有:");

                                    for(int w=0;w<carN.length;w++) {

                                        if(!listW.contains(carN[w])) { //判断重复值

                                            if(carW[w]>0) { //判断座位数大于0

                                                listW.add(carN[w]); //加到list

                                            }

                                        }

                                    }

                                    System.out.print(listW); //输出 去重复值 后的车

                                    if(toWeigth<=0) { //判断有没有选择货车

                                        System.out.println("无");

                                    }else {

                                        System.out.println("\t总载货:"+toWeigth+"吨");

                                    }

                                    System.out.println("租车总价格:"+toMoney*day+"元");

                                }else {

                                    int tfDay=3;

                                    System.out.println("租车天数错误,请重新输入：");

                                    while(tfDay>=0) {

                                        day=input.nextInt();

                                        tfDay--;

                                    }

                                    if(tfDay<=0) {

                                        System.out.println("输入租车天数错误次数已达最大值,默认给您选择租车天数为1天");

                                        day=1;

                                    }

                                }

                                if(carType==0) {

                                    break;

                                }

                            }

                        }

                    }

                    else{

                        if(tfNum>0) {

                            System.out.println("输入错误！租车数量需要在1-"+maxC+"之间，还可输入"+tfNum+"次。");

                            System.out.println("请重新输入租车数量：");

                        }

                        else if(tfNum<=0) {

                            System.out.println("输入的租车数量,错误次数已达3次,退出租车界面");

                            break;

                        }

                    }

                }

            }

            else if(confirmInt==2) {

                System.out.println("您选择了否,感谢使用!");

                break;

            }

            else if(confirmInt!=1||confirmInt!=2){

                if(tf>0) {

                    System.out.println("输入错误！还可输入"+tf+"次。");

                    System.out.println("输入数字选择您是否要租车？ 1是，2否");

                }

                else if(tf<=0) {

                    System.out.println("输入需求错误次数已到达3次,退出租车界面。");

                }

            }

        }

    }



}