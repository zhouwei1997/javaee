package com.hengyu.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.list
 * ClassName: ListDemo
 * Author: hengyu
 * Date: 2020/8/10 20:03
 * project name: javase
 * Version:
 * Description:
 * <p>
 * java.util.list接口 extends Collection接口
 * List接口的特点：
 * 1、有序的集合，存储元素和取出元素的顺序是一致的
 * 2、有索引，包含一些带索引的方法
 * 3、允许存储重复的元素
 * <p>
 * List接口中带索引的方法
 * public void add(int index,E element);将指定的元素，添加到该集合的指定位置
 * public E get(int index);返回指定集合中指定位置的元素
 * public E remove(int index);移除列表中指定位置的元素，返回的是被移除的元素
 * public E set(int index,E element);用指定元素替换集合中指定位置的元素，返回值的是更新前的元素
 */
public class ListDemo {

    //使用多态创建List集合
    private List<String> list = new ArrayList<>();

    /**
     * 公共的方法
     */
    private void publicMethod() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);
    }

    /**
     * 使用add方法想集合中添加元素
     * 在c和d之间添加itcase
     */
    @Test
    public void addTest() {
        publicMethod();
        list.add(3, "itcase");
        System.out.println(list);
    }

    /**
     * 移除集合中的c元素
     */
    @Test
    public void removeTest(){
        publicMethod();
        list.remove(2);
        System.out.println("被移除的元素："+list.remove(2));
        System.out.println(list);
    }

    /**
     * 把最后一个元素a替换为A
     */
    @Test
    public void setTest(){
        publicMethod();
        System.out.println("被替换的元素："+list.set(4,"A"));
        System.out.println(list);
    }
}
