package com.hengyu.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.map
 * ClassName: MapDemo
 * Author: hengyu
 * Date: 2020/8/11 22:56
 * project name: javase
 * Version:
 * Description: Map集合
 */
public class MapDemo {


    /**
     * public V put(K key,V value);
     * 把指定的键和指定的值添加到Map集合中
     */
    @Test
    public void putTest() {
        //创建Map集合对象
        Map<String, String> map = new HashMap<>();
        map.put("李晨", "范冰冰");
        map.put("冷锋", "龙小云");
        map.put("杨过", "小龙女");
        map.put("尹志平", "小龙女");
        System.out.println(map);
    }

    /**
     * public V remove(Object key);
     * 把指定的键所对应的键值对元素，在Map集合中删除，返回被删除元素的值
     */
    @Test
    public void removeTest() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        System.out.println(map);
        map.remove("林志玲");
        System.out.println(map);
    }

    /**
     * public V get(Object key);
     * 根据指定的键，在Map集合中获取对应的值
     */
    @Test
    public void getTest() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        System.out.println(map.get("杨颖"));
    }

    /**
     * public Set<K> keySet();
     * 获取Map集合中所有的键，存储到Set集合中
     */
    @Test
    public void keySet() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        //使用Map集合中的方法keySet，把Map集合所有的key取出来，存储到一个Set集合中
        Set<String> set = map.keySet();
        //遍历set集合，获取Map集合中的每一个key
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            //通过map集合中的方法get，通过key找到value
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }

    /**
     * public Set<Map.Entry<K,V>> entrySet();
     * 获取到Map集合中所有的键值对对象的集合（Set集合）
     */
    @Test
    public void entrySetTest() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        //使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个Set集合中
        Set<Map.Entry<String,Integer>> set=map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Integer> entry=iterator.next();
            //通过map集合中的方法get，通过key找到value
            String key = entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key + "=" + value);
        }

    }

    /**
     * public boolean containsKey(Object key)
     * 判断集合中是否包含指定的键
     */
    @Test
    public void containsKeyTest() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        System.out.println(map.containsKey("赵丽颖"));
        System.out.println(map.containsKey("赵颖"));
    }
}