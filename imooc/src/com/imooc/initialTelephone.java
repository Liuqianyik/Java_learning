package com.imooc;

public class initialTelephone {
    public static void main(String[] args) {
        //把类创建成一个实例对象
        Telephone phone=new Telephone();
        phone.sendMessage();//赋值前里面的值都默认为零
        //给实例变量赋值
        phone.screen = 5.0f;
        phone.cpu = 1.4f;
        phone.mem = 2.0f;
        //调用对象的方法
        phone.sendMessage();
    }
}
