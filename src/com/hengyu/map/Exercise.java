package com.hengyu.map;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.map
 * ClassName: Exercise
 * Author: hengyu
 * Date: 2020/8/12 22:47
 * project name: javase
 * Version:
 * Description: 计算一个字符串中每个字符出现的次数
 */
public class Exercise {

    /**
     * 1、使用Scanner获取用户输入的字符串
     * 2、创建Map集合，key是字符串中的字符，value是字符的个数
     * 3、遍历字符串，获取每一个字符
     * 4、使用获取到的字符，去Map集合判断key是否存在
     * key存在，通过key获取value，然后value++，put(key,value)把新的value存储到Map集合中
     * key不存在，put(key,1)
     * 5、遍历Map集合，输出结果
     */
    public static void main(String[] args) {
        //使用Scanner获取用户输入的字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scanner.next();
        //创建Map集合，key是字符串中的字符，value是字符的个数
        Map<Character, Integer> map = new HashMap<>();
        //遍历字符串，获取每一个字符
        for (char c : str.toCharArray()) {
            //使用获取到的字符，去Map集合判断key是否存在
            if (map.containsKey(c)) {
                //key存在
                Integer value = map.get(c);
                value++;
                map.put(c, value);
            } else {
                //key不存在
                map.put(c, 1);
            }
        }
        //遍历Map集合，输出结果
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
