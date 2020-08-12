package com.hengyu.map.hashMap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.map.hashMap
 * ClassName: HashMapDemo
 * Author: hengyu
 * Date: 2020/8/12 22:07
 * project name: javase
 * Version:
 * Description: HashMap存储自定义类型键值
 * <p>
 * Map集合保证key是唯一的
 * 作为Key的元素，必须重写hashCode方法和equals方法，以保证key是唯一的
 */
public class HashMapDemo {

    /**
     * HashMap存储自定义类型键值
     * key：String类型
     * value：Person类型，value可以重复，（同名同年龄的人视为提同一个）
     */
    @Test
    public void customTest() {
        //创建HashMap集合
        HashMap<String, Person> hashMap = new HashMap<>();
        //集合中添加元素
        hashMap.put("北京", new Person("张三", 18));
        hashMap.put("上海", new Person("李四", 19));
        hashMap.put("杭州", new Person("王五", 20));
        hashMap.put("广州", new Person("赵柳六", 25));
        hashMap.put("北京", new Person("李三", 18));
        //使用keySet增强型for遍历Map集合
        Set<String> set = hashMap.keySet();
        for (String key : set) {
            Person value = hashMap.get(key);
            System.out.println(value);
        }
    }

    /**
     * HashMap存储自定义类型键值
     * key：Person类型，必须重写hashCode方法和equals方法，以保证key唯一
     * value：String类型，value可以重复，（同名同年龄的人视为提同一个）
     */
    @Test
    public void PersonTest() {
        //创建HashMap集合
        HashMap<Person, String> hashMap = new HashMap<>();
        //集合中添加元素
        hashMap.put(new Person("女王", 18), "英国");
        hashMap.put(new Person("秦始皇", 38), "秦国");
        hashMap.put(new Person("李世民", 29), "唐朝");
        hashMap.put(new Person("爱新觉罗溥仪", 18), "大清国");
        hashMap.put(new Person("女王", 18), "毛里求斯");
        //使用entrySet和增强for遍历Map集合
        Set<Map.Entry<Person, String>> set = hashMap.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
