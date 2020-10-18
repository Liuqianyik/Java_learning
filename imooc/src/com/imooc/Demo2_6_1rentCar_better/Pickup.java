package com.imooc.Demo2_6_1rentCar_better;
//皮卡汽车
public class Pickup extends Car{
    public Pickup(String name,int rent,int seatCount,double load){
        super(name,rent,seatCount,load);//调用父类的有参构造方法
    }
    /*
    创建对象时其实是在执行无参的构造方法
    super关键字在对象的内部使用，可代表父类对象【继承】
    1.访问父类的属性-->super.age
    2.访问父类的方法-->super.eat()
    *如果子类的构造方法中没有显示的调用父类的构造方法，则系统默认调用父类无参的构造方法
    *如果显示的调用构造方法，必须在子类的构造方法的第一行
    *如果子类构造方法中既没有显示调用父类的构造方法，而父类中又没有无参的构造方法，则编译出错，因为子类构造方法的第一行总会隐式的调用一个父类的午餐的构造方法

     */
}
