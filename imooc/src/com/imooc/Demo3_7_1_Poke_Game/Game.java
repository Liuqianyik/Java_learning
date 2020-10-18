package com.imooc.Demo3_7_1_Poke_Game;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private List<Card> cards;
    private List<Player> players;
    Game(){
        cards=new ArrayList<Card>();
        players=new ArrayList<Player>();
    }
    //初始化卡牌
    public void setCards(){//获取卡牌
        System.out.println("-----------创建扑克牌--------------");
        String[] suits={"黑桃","红桃","梅花","方片"};//花色
        String[] numbers={"2","3","4","5","6","7","8","9","10", "J","Q","K","A"};//点数
        for(int i=0;i<suits.length;i++){
            for(int j=0;j<numbers.length;j++){
                cards.add(new Card(suits[i],numbers[j]));
            }
        }
        System.out.println("-----------扑克牌创建成功！--------------");
        System.out.println(cards);
    }
    //洗牌，第一个对象插入随机位置
    public void shuffle(){
        System.out.println("-----------开始洗牌！--------------");
        Random random=new Random();
        for(int i=0;i<cards.size();i++){
            //洗牌次数我随便设的，没有科学依据
            Card c=cards.get(0);
            //获取第一个元素
            cards.add(random.nextInt(cards.size()),c);
            //将第一个元素再次添加在任意位置
            cards.remove(0);
            //移除第一个元素
        }
        System.out.println("-----------洗牌结束！--------------");
        //System.out.println(cards); }
    }
    //初始化玩家2人
    public void setPlayers(){
        Scanner in=new Scanner(System.in);
        int i=1;
        do{
            System.out.println("请输入第"+i+"位玩家的ID和姓名:");
            while(true){
                try{
                    System.out.println("请输入ID:");
                    int id=in.nextInt();
                    if(players.contains(new Player(id+"",null)))
                        throw new Exception();
                    //ID已存在，抛出异常 System.out.println("请输入玩家姓名:");
                    System.out.println("请输入姓名:");
                    String name=in.next();
                    players.add(new Player(id+"",name));
                    break;
                    //新建信息成功，跳出循环
                }catch(InputMismatchException e){
                    in=new Scanner(System.in);
                    //这个必须有，不然就是死循环了
                    System.out.println("请输入整数类型的ID!");
                }catch(Exception e){
                    System.out.println("该ID已存在，请重新输入！");
                }
            }
            i++;
        }while(i<3);
        for(int j=0;j<players.size();j++){
            System.out.println("---欢迎玩家："+players.get(j).name);
        }
    }

    //发牌
    public void dealCards(){
        System.out.println("-----------开始发牌！--------------");
        for(int i=0;i<2;i++){//每人发牌数i
            for(int j=0;j<players.size();j++){//玩家数j
                System.out.println("---玩家"+players.get(j).name+"-拿牌");
                players.get(j).setCards(cards.get(0)); cards.remove(0);
            }
        }
        System.out.println("-----------发牌结束！--------------");
    }

    //比较卡牌大小
    public void playCards(){
        System.out.println("-----------游戏开始！--------------");
        for(int i=0;i<players.size();i++){
            Collections.sort(players.get(i).cards);//collection.sort()默认按照升序来排序
            System.out.println("玩家："+players.get(i).name+"最大的手牌为"+players.get(i).cards.get(1));
        }
        int judge=players.get(0).cards.get(1).compareTo(players.get(1).cards.get(1));
        String name=judge>0 ? players.get(0).name:players.get(1).name;
        //条件语句，相当于if...else
        System.out.println("-----------玩家："+name+"获胜！--------------");
    }

    //展示手牌
    public void showCards(){
        System.out.println("-----------玩家手牌展示--------------");
        System.out.println(players.get(0)+""+players.get(0).cards);
        System.out.println(players.get(1)+""+players.get(1).cards);
    }

}
