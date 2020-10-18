package com.imooc.Demo3_2_2_String1;

/**
 * 请在编辑器中的第 7、14 行中将代码填写完整，
 * 并注意观察代码和运行结果，加强对字符串应用的理解~~
 */
public class HelloWorld {
    public static void main(String[] args) {
        String s1 = "imooc";
        String s2 = "imooc";

        //定义字符串s3，保存“I love”和s1拼接后的内容

        String s3 = "I love" + s1;
        // 比较字符串s1和s2
        // imooc为常量字符串，多次出现时会被编译器优化，只创建一个对象
        System.out.println("s1和s2内存地址相同吗？" + (s1 == s2));

        //比较字符串s1和s3
        System.out.println("s1和s3内存地址相同吗？" + (s1 ==s3));

        String s4 = "I love " + s1;
        //比较字符串s4和s3
        // s1是变量，s4在运行时才知道具体值，所以s3和s4是不同的对象
        System.out.println("s3和s4内存地址相同吗？" + (s4 == s3));
    }
}
