package com.imooc.Demo3_7_1_ByMyself;

import java.sql.Connection;

public class Card implements Comparable<Card> {//Card类通过implements来声明自己使用Comparable这个接口
    //花色
    public String suit;
    //点数
    public String number;
    //有参的构造方法
    Card(String suit,String number){
        this.suit = suit;
        this.number = number;
    }
    //为了显示的时候方便而设的一个方法
    public String toString(){
        return(this.suit+this.number);
    }

    //显示点数排序
    public int getNumberNum(){
        String[] numbers = {"2","3","4","5","6","7","8","9","J","Q","K","A"};
        for(int i=0;i<numbers.length;i++){
            if(this.number.equals(numbers[i]))
                return i;
        }
        return -1;
    }

    //显示花色排序
    public int getSuitNum(){
        String[] suits = {"黑桃","红桃","梅花","方片"};
        for(int j=0;j<suits.length;j++){
            if(this.suit.equals(suits[j]))
                return j;
        }
        return -1;
    }

    public int compareTo(Card c){
        if(this.getNumberNum()==c.getNumberNum()){
            return(this.getSuitNum()-c.getSuitNum());
        }else{
            return(this.getSuitNum()-c.getSuitNum());
        }
    }
}
