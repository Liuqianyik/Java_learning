package com.imooc.Demo3_2_4_String3;

/**知识点
 * 那么，“==” 和 equals() 有什么区别呢？
 *
 * ==: 判断两个字符串在内存中首地址是否相同，即判断是否是同一个字符串对象
 *
 * equals(): 比较存储在两个字符串对象中的内容是否一致
 * ***注意是字符串不是字符
 */

/**题目
 * 功能：统计指定字符串中字符 ‘a’ 出现的次数
 *
 * 分析：可以通过循环遍历字符串中的每一个字符，判断是否是字符 a ，如果是，则累加统计出现的次数
 *
 * 请在编辑器中的第 10、13 行中将代码填写完整
 *
 * 运行结果：字符a出现的次数：8
 */
public class HelloWorld {
    public static void main(String[] args) {
        // 定义一个字符串
        String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";

        // 出现次数
        int num = 0;

        // 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
        for (int i=0;i<s.length();i++){
            // 获取每个字符，判断是否是字符a
            if (s.charAt(i) == 'a') {
                // 累加统计次数
                num++;
            }
        }
        System.out.println("字符a出现的次数：" + num);
    }
}
