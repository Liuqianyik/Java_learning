package com.imooc._Demo3_4_3_Collection_map;
import java.util.Set;
import java.util.HashSet;


public class Student {
    public String id;

    public String name;

    public Set courses;

    public Student(String id,String name){
        this.id = id;
        this.name = name;
        this.courses = new HashSet();
    }
}
