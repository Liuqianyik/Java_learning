package com.imooc.Demo3_3_7_Calendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 亲， Calendar 类的使用您掌握了吗？让我们来检验下吧。
 *
 * 代码编辑器中实现获取 Calendar 对象，
 * 并转换为指定格式的时间。
 * 请将第 9、12 行代码补充完整
 */
public class HelloWorld {

    public static void main(String[] args) {
        // 创建Calendar对象
        Calendar c = Calendar.getInstance();

        // 将Calendar对象转换为Date对象
        Date date = c.getTime();

        // 创建SimpleDateFormat对象，指定目标格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 将日期转换为指定格式的字符串
        String now = sdf.format(date);
        System.out.println("当前时间：" + now);
    }
}
