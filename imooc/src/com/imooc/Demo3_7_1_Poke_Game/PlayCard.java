package com.imooc.Demo3_7_1_Poke_Game;

public class PlayCard {

    public static void main(String[] args) {
        Game gm=new Game();
        gm.setCards();//获取卡牌
        gm.shuffle();//洗牌
        gm.setPlayers();//获取用户
        gm.dealCards();//发牌
        gm.playCards();//开始游戏
        gm.showCards();//展示卡牌

    }

}