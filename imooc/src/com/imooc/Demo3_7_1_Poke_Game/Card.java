package com.imooc.Demo3_7_1_Poke_Game;

//要比较卡牌的大小，所以要添加比较方法
public class Card implements Comparable<Card> {//Card类通过implements来声明自己使用Comparable这个接口

    public String suit;
    //花色
    public String number;
    //点数
    Card(String suit, String number){//有参的构造方法
        this.suit=suit;
        this.number=number;
    }

    //展示卡牌信息用（比如用户1的最大手牌是【梅花9】）
    public String toString(){
        return suit+number;
    }

    //实现比较方法
    public int compareTo(Card c){
        if(this.getNumberNum()==c.getNumberNum())
            return this.getSuitNum()-c.getSuitNum();
        else return this.getNumberNum()-c.getNumberNum();
    }

    //获取点数排序
    public int getNumberNum(){
        String[] numbers={"2","3","4","5","6","7","8","9","10", "J","Q","K","A"};
        for(int i=0;i<numbers.length;i++){
            if(numbers[i].equals(number))
                return i;
        }
        return -1;//按道理都会在for循环中的某一环结束，只要执行了上面的return i这个程序就结束了，return -1执行只能说明程序有异常了
    }

    //获取花色排序
    public int getSuitNum(){
        String[] suits={"黑桃","红桃","梅花","方片"};
        for(int i=0;i<suits.length;i++){
            if(suits[i].equals(suit))
                return i;
        }
        return -1;
    }
}