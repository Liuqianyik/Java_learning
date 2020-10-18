package com.imooc.Demo2_2_6;

public class Demo2_2_6 {
    //外部类的私有属性name
    private String name = "imooc";

    //外部类的成员属性
    int age = 20;

    //成员内部类Inner
    public class Inner {
        String name = "爱慕课";
        //内部类中的方法
        public void show() {
            System.out.println("外部类中的name：" + Demo2_2_6.this.name);
            System.out.println("内部类中的name：" + name);
            System.out.println("外部类中的age：" + age);
        }
    }

    //测试成员内部类
    public static void main(String[] args) {

        //创建外部类的对象
        Demo2_2_6 o = new Demo2_2_6();

        //创建内部类的对象
        Inner inn = o.new Inner();             ;

        //调用内部类对象的show方法
        inn.show();
    }
}
