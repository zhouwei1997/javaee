package com.example;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.example
 * ClassName: FightAgainstLandlords
 * Author: hengyu
 * Date: 2020/8/9 19:03
 * project name: javase
 * Version:
 * Description:
 * <p>
 * 斗地主综合案例
 * 1、准备牌
 * 2、洗牌
 * 3、发牌
 * 4、看牌
 */
public class FightAgainstLandlords {

    public static void main(String[] args) {

        /**
         * 准备牌
         * 定义一个存储54张牌的ArrayList集合，泛型使用String
         * 定义两个数组，一个数组存储牌的花色，一个数组存储牌的序号
         */
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠", "♥", "♣", "♦" };
        String[] numbers = {"2", "A", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        //将大小王加入到poker集合中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组
        for (String number : numbers) {
            for (String color : colors) {
                //把组合好的牌存储到poker集合中
                poker.add(color + number);
            }
        }

        /**
         * 洗牌
         * 使用集合的工具类Collections中的方法
         * static void shuffle(List<?> list)使用默认随机源对指定列表进行置换
         */
        Collections.shuffle(poker);

        /**
         * 发牌
         * 定义四个集合，存储玩家的牌和底牌
         */
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        /**
         * 遍历poker集合，获取每一张牌
         * 使用poker集合的索引%3给3个玩家轮流发牌。
         * 剩余三张牌给底牌
         */
        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String p = poker.get(i);
            //轮流发牌
            if (i >= 51) {
                //给底牌发牌
                diPai.add(p);
            } else if (i % 3 == 0) {
                //给玩家1发牌
                player01.add(p);
            } else if (i % 3 == 1) {
                //给玩家2发牌
                player02.add(p);
            } else if (i % 3 == 2) {
                //给玩家3发牌
                player03.add(p);
            }
        }

        //看牌
        System.out.println("玩家1：" + player01);
        System.out.println("玩家2：" + player02);
        System.out.println("玩家3：" + player03);
        System.out.println("底牌：" + diPai);
    }
}
