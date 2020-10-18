package com.imooc.BorrowBook3_1_9;

public class Book {
    String name;
    int number;

    public Book(String name,int number){
        this.name = name;
        this.number = number;
    }

    public void showBookName(){
        System.out.println("book:"+name);
    }
}
