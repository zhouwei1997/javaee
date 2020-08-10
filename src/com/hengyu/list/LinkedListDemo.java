package com.hengyu.list;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;
import org.junit.Test;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.list
 * ClassName: LinkedListDemo
 * Author: hengyu
 * Date: 2020/8/10 21:33
 * project name: javase
 * Version:
 * Description:
 * <p>
 * java.util.LinkedList集合 implement List接口
 * <p>
 * LinkedList集合的特点：
 * 1、底层是一个链表结构：查询慢，增删快
 * 2、里面包含了大量的首尾元素的方法
 * <p>
 * public void addFirst(E e)：将指定元素插入到此列表的开头
 * public void addLast(E e)：将指定元素插入到此列表的结尾
 * public E getFirst()：返回此列表的第一个元素
 * public E getLast()：返回此列表的最后一个元素
 * public E removeFirst()：移除此列表的第一个元素
 * public E removeLast()：移除此列表的最后一个元素
 * public E pop()：从此列表所表示的堆栈中弹出一个元素
 * public void push(E e)：将元素推入此列表所表示的堆栈
 * public Boolean isEmpty()：如果列表中不包含元素，则返回true
 */
public class LinkedListDemo {

    private LinkedList<String> linkedList = new LinkedList<>();

    /**
     * public void addFirst(E e)：将指定元素插入到此列表的开头
     * public void addLast(E e)：将指定元素插入到此列表的结尾
     * public void push(E e)：将元素推入此列表所表示的堆栈
     */
    @Test
    public void addTest() {
        //使用add方法往集合中添加元素
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        System.out.println(linkedList);
        linkedList.addFirst("www");
        System.out.println(linkedList);
        linkedList.addLast("eee");
        System.out.println(linkedList);
    }

    /**
     * public E getFirst()：返回此列表的第一个元素
     * public E getLast()：返回此列表的最后一个元素
     */
    @Test
    public void getTest() {
        addTest();
        System.out.println("第一个元素：" + linkedList.getFirst());
        System.out.println("最后一个元素：" + linkedList.getLast());
    }
}
