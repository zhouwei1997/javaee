package com.hengyu.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.set
 * ClassName: LinkedHashSetDemo
 * Author: hengyu
 * Date: 2020/8/11 22:02
 * project name: javase
 * Version:
 * Description:
 * <p>
 * java.util.LinkedHashSet集合 extends HashSet集合
 * <p>
 * LinkedHashSet集合特点：
 * 底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class LinkedHashSetDemo {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("abc");
        set.add("www");
        set.add("itheima");
        System.out.println(set);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("abc");
        linkedHashSet.add("abc");
        linkedHashSet.add("www");
        linkedHashSet.add("itheima");
        System.out.println(linkedHashSet);
    }
}
