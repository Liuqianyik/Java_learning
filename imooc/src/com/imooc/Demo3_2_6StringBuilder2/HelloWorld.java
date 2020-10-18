package com.imooc.Demo3_2_6StringBuilder2;

/**
 * 功能：将一个由英文字母组成的字符串转换成指定格式---从右边开始每三个字母用逗号分隔的形式。
 *
 * 请在编辑器中的第 4、10 行将代码填写完整
 *
 * 运行效果： j,aew,kjl,dfx,mop,zdm
 */
public class HelloWorld {
    public static void main(String[] args) {
        // 创建一个空的StringBuilder对象
        StringBuilder str = new StringBuilder();

        // 追加字符串
        str.append("jaewkjldfxmopzdm");

        // 从后往前每隔三位插入逗号
        for(int i=str.length()-3;i>0;i-=3){//这里创建i这个变量的时候一定记得加前缀int否则会报错
            str.insert(i,",");
        }




        // 将StringBuilder对象转换为String对象并输出
        System.out.print(str.toString());
    }
}
