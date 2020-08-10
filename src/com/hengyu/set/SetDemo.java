package com.hengyu.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.set
 * ClassName: SetDemo
 * Author: hengyu
 * Date: 2020/8/10 21:52
 * project name: javase
 * Version:
 * Description:
 * <p>
 * java.util.Set接口 extends Collection接口
 * Set接口的特点：
 * 1、不允许存储重复的元素
 * 2、没有索引，没有带索引的方法，也不能使用普通的for循环遍历
 * <p>
 * java.util.HashSet集合 implement Set接口
 * <p>
 * HashSet 特点：
 * 1、不允许存储重复的元素
 * 2、没有索引，没有带索引的方法，也不能使用普通的for循环遍历
 * 3、是一个无序的集合，存储元素和取出元素的顺序有可能不一致
 * 4、底层是一个哈希表结构（查询的速度非常快）
 */
public class SetDemo {

    /**
     *
     */
    @Test
    public void hashSetTest() {
        Set<Integer> set = new HashSet<>();
        //使用add方法往集合中添加元素
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(1);
        //使用迭代器遍历set集合
        Iterator<Integer> iterator=set.iterator();
        while (iterator.hasNext()){
            Integer num=iterator.next();
            System.out.println(num);
        }
    }
}
