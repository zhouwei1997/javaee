package com.hengyu.multithread;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.multithread
 * ClassName: Person
 * Author: hengyu
 * Date: 2020/8/15 14:18
 * project name: javase
 * Version:
 * Description:
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        //定义循环，执行20次
        for (int i = 0; i < 20; i++) {
            System.out.println(name + "---->" + i);
        }
    }
}
