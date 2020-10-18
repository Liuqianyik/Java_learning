package com.imooc.Demo3_7_1_ByMyself;

import java.util.ArrayList;
import java.util.List;

public class Player {
    //玩家ID
    public String ID;
    //玩家姓名
    public String name;
    //玩家的手牌集（属性）
    public List<Card> cards;
    //有参的构造方法
    public Player(String ID,String name){
        this.ID = ID;
        this.name = name;
        cards = new ArrayList<Card>();
    }
    //添加手牌（方法）
    public void setCards(Card c){
        cards.add(c);
    }
    //为了好展示信息
    public String toString(){
        return "Name:"+name;
    }
    //用户类，为了防止ID重复，重写了equals，这样可以调用contains判断
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(o==null)
            return false;
        if(!(o instanceof Player))
            return false;
        Player p=(Player)o;
        return ID.equals(p.ID);
    }
}
