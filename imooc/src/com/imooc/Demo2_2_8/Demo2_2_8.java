package com.imooc.Demo2_2_8;

public class Demo2_2_8 {
    private String name = "爱慕课";

    // 外部类中的show方法
    public void show() {
        // 定义方法内部类
        class MInner {
            int score = 83;
            public int getScore() {
                return score + 10;
            }
        }

        // 创建方法内部类的对象
        MInner mi = new MInner();

        // 调用内部类的方法
        int newScore=mi.getScore();
        System.out.println("姓名：" + name + "\n加分后的成绩：" + newScore);
    }

    // 测试方法内部类
    public static void main(String[] args) {

        // 创建外部类的对象
        Demo2_2_8 mo = new Demo2_2_8();

        // 调用外部类的方法
        mo.show();
    }
}
