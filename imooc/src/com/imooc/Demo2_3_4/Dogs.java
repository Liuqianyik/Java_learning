package com.imooc.Demo2_3_4;

public class Dogs extends Animal {
    //方法的重写
    public void eat(){
        System.out.println("狗具有吃东西的能力");
    }
    public Dogs(){
        System.out.println("Dog类执行了");
    }
}
