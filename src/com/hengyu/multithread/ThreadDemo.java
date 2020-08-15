package com.hengyu.multithread;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.multithread
 * ClassName: ThreadDemo
 * Author: hengyu
 * Date: 2020/8/15 15:13
 * project name: javase
 * Version:
 * Description:
 */
public class ThreadDemo {

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
    }
}
