package com.hengyu.map;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.map
 * ClassName: HashtableDemo
 * Author: hengyu
 * Date: 2020/8/12 22:39
 * project name: javase
 * Version:
 * Description:
 */
public class HashtableDemo {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("b", null);
        map.put(null, null);
        System.out.println(map);
    }
}
