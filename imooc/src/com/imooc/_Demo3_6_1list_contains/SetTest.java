package com.imooc._Demo3_6_1list_contains;

import java.util.ArrayList;
import java.util.List;

public class SetTest {
    public List<Course> coursesToSelect;
    public SetTest(){
        coursesToSelect = new ArrayList<Course>();
    }
    /**
     * 测试List的contains方法
     */
    public void testListContains(){
        //取得备选课程序列的第0个元素
        Course course = coursesToSelect.get(0);
        //打印输出coursesToSelected是否包含course对象
        System.out.println("取得课程："+course.name);
        System.out.println("备选课程中是否包含课程："+course.name+","+coursesToSelect.contains(course));

    }

    public void testAdd(){
        //创建一个课程对象，并通过调用add方法，添加到备选课程中去
        Course cr1 = new Course("1","数据结构");
        coursesToSelect.add(cr1);
        Course cr2 = new Course("2","C语言");
        coursesToSelect.add(0,cr2);

    }

    public static void main(String[] args) {
        SetTest st = new SetTest();
        st.testAdd();
        st.testListContains();
    }
}
