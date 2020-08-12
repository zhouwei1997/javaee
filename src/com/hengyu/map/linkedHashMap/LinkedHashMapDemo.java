package com.hengyu.map.linkedHashMap;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.map.linkedHashMap
 * ClassName: LinkedHashMapDemo
 * Author: hengyu
 * Date: 2020/8/12 22:33
 * project name: javase
 * Version:
 * Description:
 */
public class LinkedHashMapDemo {

    @Test
    public void test() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("d", "d");
        System.out.println(map);
        System.out.println("====================================");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a", "a");
        linkedHashMap.put("c", "c");
        linkedHashMap.put("b", "b");
        linkedHashMap.put("d", "d");
        System.out.println(linkedHashMap);
    }
}
