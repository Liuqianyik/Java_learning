package com.imooc.Demo2_5_2_chouxiang;

public class Test {
    public static void main(String[] args) {
        //多态
        Person p = new Chinese();
        Person p2 = new American();
        p.say();
        p2.say();
    }
}
