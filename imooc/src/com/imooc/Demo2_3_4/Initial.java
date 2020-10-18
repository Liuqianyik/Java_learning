package com.imooc.Demo2_3_4;

public class Initial {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        //创建了一个子类的实例对象，根据输出结果可以看出他会先执行父类主函数在执行子类主函数
        dog.age = 10;
        dog.name = "xiaotian";
        dog.eat();
    }
}
/*
继承初始化顺序
1.父类对象-》父类属性初始化-》父类构造方法
2.子类对象-》子类属性初始化-》子类构造方法
 */