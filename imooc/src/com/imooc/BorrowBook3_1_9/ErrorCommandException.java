package com.imooc.BorrowBook3_1_9;

public class ErrorCommandException extends Exception {
    public ErrorCommandException(){
        super("命令输入错误！请根据提示输入数字命令！");
    }
}
