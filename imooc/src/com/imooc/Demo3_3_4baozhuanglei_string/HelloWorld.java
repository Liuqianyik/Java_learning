package com.imooc.Demo3_3_4baozhuanglei_string;

/**
 * 在编辑器中完成了基本类型和字符串之间的转换。
 */
public class HelloWorld {
    public static void main(String[] args) {

        double m = 78.5;
        //将基本类型转换为字符串
        String str1 = m+"";

        System.out.println("m转换为String型后与整数20的求和结果为： "+(str1+20));

        String str = "180.20";
        // 将字符串转换为基本类型
        Double a = Double.valueOf(str);

        System.out.println("str 转换为double型后与整数20的求和结果为： "+(a+20));
    }
}
