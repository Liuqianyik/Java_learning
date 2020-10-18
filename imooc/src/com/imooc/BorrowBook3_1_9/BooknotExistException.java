package com.imooc.BorrowBook3_1_9;
//自定义异常必须继承于一个意思相近的基类或者所有异常的父类
public class BooknotExistException extends Exception {
    public BooknotExistException(){
        super("图书不存在！");
    }
}
