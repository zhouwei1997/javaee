package com.hengyu.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.collections
 * ClassName: CollectionsDemo
 * Author: hengyu
 * Date: 2020/8/11 22:33
 * project name: javase
 * Version:
 * Description:Collections集合工具类
 */
public class CollectionsDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        //往集合中添加多个元素
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("e");

        //使用addAll完成上面的操作
        Collections.addAll(list, "a", "b", "c", "d", "e");
        System.out.println(list);
    }
}
