package com.imooc.Demo3_7_1_Poke_Game;

import java.util.ArrayList;
import java.util.List;

//用户类，为了防止ID重复，重写了equals，这样可以调用contains判断
public class Player {

    public String id;
    public String name;
    public List<Card> cards;
    Player(String id, String name){
        this.id=id; this.name=name;
        cards=new ArrayList<Card>();
    }
    public void setCards(Card c){
        cards.add(c);
    }
    //重写toString只是为了写程序的时候测试用着方便
    public String toString(){
        return "Name:"+name;
    }
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(o==null)
            return false;
        if(!(o instanceof Player))
            return false;
        Player p=(Player)o;
        return id.equals(p.id);
    }
}