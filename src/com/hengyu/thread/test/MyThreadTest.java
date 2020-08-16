package com.hengyu.thread.test;


import com.hengyu.thread.MyThread;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.generic.test
 * ClassName: MyThreadTest
 * Author: hengyu
 * Date: 2020/8/16 10:00
 * project name: javase
 * Version:
 * Description:
 */
public class MyThreadTest {

    public static void main(String[] args) {
        //创建子类对象
        MyThread myThread = new MyThread();
        //调用start方法，开启新线程，执行run方法
        myThread.start();
        new MyThread().run();
    }


}
