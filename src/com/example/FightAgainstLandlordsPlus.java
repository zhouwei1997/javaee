package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.example
 * ClassName: FightAgainstLandlords
 * Author: hengyu
 * Date: 2020/8/9 19:03
 * project name: javase
 * Version:
 * Description:
 * 斗地主综合案例（有序版本）
 * 1、准备牌
 * 2、洗牌
 * 3、发牌
 * 4、排序
 * 5、看牌
 */
public class FightAgainstLandlordsPlus {

    public static void main(String[] args) {

        /**
         * 准备牌
         * 创建一个Map集合，存储牌的索引和组装好的牌
         */
        HashMap<Integer, String> poker = new HashMap<>();
        //创建一个List集合，存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义两个集合，定义花色和牌的序号
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int index = 0;
        //将大小王加入到poker集合中
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        //循环嵌套遍历两个数组
        for (String number : numbers) {
            for (String color : colors) {
                //把组合好的牌存储到poker集合中
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }

        /**
         * 洗牌
         * 使用集合的工具类Collections中的方法
         * static void shuffle(List<?> list)使用默认随机源对指定列表进行置换
         */
        Collections.shuffle(pokerIndex);

        /**
         * 发牌
         * 定义四个集合，存储玩家的牌和底牌的索引
         */
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        /**
         * 遍历poker集合，获取每一张牌
         * 使用poker集合的索引%3给3个玩家轮流发牌。
         * 剩余三张牌给底牌
         */
        for (int i = 0; i < pokerIndex.size(); i++) {
            //获取每一张牌
            Integer in = pokerIndex.get(i);
            //轮流发牌
            if (i >= 51) {
                //给底牌发牌
                diPai.add(in);
            } else if (i % 3 == 0) {
                //给玩家1发牌
                player01.add(in);
            } else if (i % 3 == 1) {
                //给玩家2发牌
                player02.add(in);
            } else if (i % 3 == 2) {
                //给玩家3发牌
                player03.add(in);
            }
        }

        /**
         * 排序
         * 使用Collections中的sort方法
         */
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);

        //看牌
        lookPoker("玩家1", poker, player01);
        lookPoker("玩家2", poker, player02);
        lookPoker("玩家3", poker, player03);
        lookPoker("底牌", poker, diPai);
    }

    /**
     * 看牌方法
     *
     * @param name  玩家名称
     * @param poker 存储牌的poker集合
     * @param list  存储玩家和底牌的list集合
     */
    private static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        //输出玩家名称
        System.out.print(name + "  ");
        //遍历玩家或者底牌集合，获取牌的索引
        for (Integer key : list) {
            //使用牌的索引，去Map集合中，找到对应的牌
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        //打印完每一个玩家的牌
        System.out.println();
    }
}
