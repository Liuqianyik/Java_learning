package com.imooc.BorrowBook3_1_9;
import java.util.*;

public class Test {
    int command;
    String inName;
    int inNum;
    Scanner input = new Scanner(System.in);
    Book[] books = {new Book("数据结构",1),new Book("高数",2)};

    public static void main(String[] args) {
        while(true){
            Test t = new Test();
            t.inputCommand();
            if(t.command == 1){
                t.inputName();
            }else if(t.command == 2){
                t.inputNumber();
            }
        }

    }

    public void inputCommand(){
        try{
            System.out.println("输入命令：1-按照名称查找图书；2-按照序号查找图书");
            command = input.nextInt();
            if(command != 1 && command != 2){
                throw new ErrorCommandException();
            }
        }catch (InputMismatchException ie){
            ErrorCommandException ee = new ErrorCommandException();
            System.out.println(ee.getMessage());
        }catch (ErrorCommandException ee){
            System.out.println(ee.getMessage());
        }
    }

    public void inputName(){
        try{
            System.out.println("输入图书名称");
            inName = input.next();
            for(int i = 0;i < books.length;i++){
                if(inName.equals(books[i].name)){
                    books[i].showBookName();
                    return;
                }
            }
            throw new BooknotExistException();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void inputNumber(){
        try{
            System.out.println("输入图书序号");
            inNum = input.nextInt();
            for(int i = 0;i < books.length;i++){
                if(inNum == books[i].number){
                    books[i].showBookName();
                    return;
                }
            }
            throw new BooknotExistException();
        }catch(InputMismatchException ie){
            input.nextLine();
            ErrorCommandException ee = new ErrorCommandException();
            System.out.println(ee.getMessage());
        } catch(BooknotExistException be){
            System.out.println(be.getMessage());
            return;
        }
    }

}
