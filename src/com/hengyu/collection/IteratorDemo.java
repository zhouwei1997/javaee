package com.hengyu.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author:hengyu
 * @Date:2020/8/6 18:07
 * @Version:1.0
 * @Discription: Iterator迭代
 * <p>
 * java.util.Iterator接口：迭代器（对集合进行遍历）
 * Collection接口中有一个iterator()方法，这个方法返回的就是迭代器的实现类对象
 * <p>
 * 迭代器的使用方法：
 * 1、使用集合中的iterator方法获取迭代器的实现类对象，使用Iterator接口接收（多态）
 * 2、使用Iterator接口中的方法hasNext判断还有没有下一个元素
 * 3、使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class IteratorDemo {

    private Collection<String> collection = new ArrayList<>();

    /**
     * 公共类方法
     * 创始元素集合
     */
    private void publicMethod() {
        collection.add("姚明");
        collection.add("李易峰");
        collection.add("迪丽热巴");
        collection.add("范冰冰");
        collection.add("李冰冰");
    }

    /**
     * 使用集合中的Iterator方法获取迭代器的实现类对象，使用Iterator接口接收（多态）
     * <p>
     * 注意：
     * Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
     */
    @Test
    public void iteratorTest() {
        publicMethod();
        Iterator<String> iteratort = collection.iterator();
//        System.out.println(iteratort.hasNext());
//        String name = iteratort.next();
//        System.out.println(name);
        while (iteratort.hasNext()) {
            String name = iteratort.next();
            System.out.println(name);
        }
    }

}
