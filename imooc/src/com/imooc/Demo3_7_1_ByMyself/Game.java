package com.imooc.Demo3_7_1_ByMyself;

import java.util.*;

public class Game {
    private List<Card> cards;
    private List<Player> players;
    Game(){
        cards=new ArrayList<Card>();
        players=new ArrayList<Player>();
    }
    //初始化卡牌
    public void setCards(){
        System.out.println("-------------------创建扑克牌--------------------");
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suits = {"黑桃","红桃","梅花","方片"};

        for(int i=0;i<numbers.length;i++){
            for(int j = 0;j< suits.length;j++){
                cards.add(new Card(numbers[i],suits[j]));
            }
        }
        System.out.println("------------------创建扑克牌成功---------------------");
        System.out.println(cards);
    }

    //洗牌
    public void shuffle(){
        System.out.println("---------------------开始洗牌---------------------");
        Random random = new Random();
        for(int i=0;i< cards.size();i++){//随便设一个洗牌次数
            Card first = cards.get(0);
            cards.add(random.nextInt(cards.size()),first);//在扑克牌范围内的任意位置插入第一张牌
            cards.remove(0);//把原来的第一张牌删掉
        }
        System.out.println("----------------------洗牌结束----------------------");
        System.out.println(cards);
    }

    //初始化用户
    public void setPlayers(){
        System.out.println("----------------------创建玩家----------------------");
        Scanner in=new Scanner(System.in);
        for(int i=0;i<2;i++){
            System.out.println("请输入第"+(i+1)+"位玩家的ID和姓名：");
            while(true){
                try{
                    System.out.println("请输入ID：");
                    int id = in.nextInt();
                    if (players.contains(new Player(id+"",null))){
                        //ID已存在，抛出异常
                        throw new Exception();
                    }
                    System.out.println("请输入姓名:");
                    String name = in.next();
                    players.add(new Player(id+"",name));
                    //新建信息成功，跳出循环
                    break;
                }catch(InputMismatchException e){
                        in = new Scanner(System.in);
                        //这个必须有，不然就是死循环了
                        System.out.println("请输入整数类型的ID!");
                }catch(Exception e){
                    System.out.println("该ID已存在，请重新输入！");
                }
                System.out.println("---欢迎玩家："+players.get(i).name);
            }
        }
    }

    //发牌
    public void dealCards(){
        System.out.println("----------------------开始发牌---------------------");
        for(int i = 0;i<2;i++){//每人拿两张牌
            for(int j = 0;j< players.size();j++){//轮流给每个玩家发牌
                System.out.println("---玩家"+players.get(j).name+"-拿牌");
                System.out.println(cards.get(0));
                players.get(j).setCards(cards.get(0)); cards.remove(0);
//                System.out.println("----玩家"+players.get(j).name+"拿牌----");
//                Card c = cards.get(0);
//                players.get(j).setCards(c);//把卡牌中的第一个发给这个玩家
//                cards.remove(c);//把这张牌从牌堆中删掉
            }
        }
        System.out.println("----------------------发牌结束---------------------");
    }

    //比较卡牌大小
    public void playCards(){
        System.out.println("-----------------------开始游戏---------------------");
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
