package com.imooc.Demo3_3_8_Math;

/**
 * 功能：定义一个包含 10 个元素的整型数组，通过随机产生 10 以内的随机数，给数组中的每个元素赋值，并输出结果。
 *
 * 运行结果：  0  3  3  2  6  3  2  7  0  9
 *
 * 注：由于数组元素值为随机产生，所以运行结果不固定，此运行结果仅作为示例
 */
public class HelloWorld {

    public static void main(String[] args) {

        // 定义一个整型数组，长度为10
        int[] nums = new int[10];

        //通过循环给数组赋值
        for (int i = 0; i < nums.length; i++) {
            // 产生10以内的随机数
            int x = (int) (Math.random()*10);

            nums[i] = x;// 为元素赋值
        }

        // 使用foreach循环输出数组中的元素******foreach循环重要哦
        for (int num:nums) {
            System.out.print(num + " ");
        }
    }
}
