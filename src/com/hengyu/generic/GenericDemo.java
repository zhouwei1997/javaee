package com.hengyu.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.generic
 * ClassName: GenericDemo
 * Author: hengyu
 * Date: 2020/8/6 21:14
 * project name: javase
 * Version:
 * Description:
 */
public class GenericDemo {

    /**
     * 创建集合对象，不使用泛型
     * 好处：集合不使用泛型，默认的类型就是Object类型，可以存储任意类型的数据
     * 弊端：代码不安全，会引发异常
     */
    @Test
    public void noGeneric() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

        //使用迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }
    }

    /**
     * 创建集合对象，使用泛型
     * 好处：
     *  1、避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
     *  2、把运行时异常提升到编译时异常
     * 弊端：泛型是什么类型，只能存储什么类型的数据
     */
    @Test
    public void useGeneric(){
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }
    }
}
