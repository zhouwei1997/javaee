package com.hengyu.thread;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.thread
 * ClassName: MyThread
 * Author: hengyu
 * Date: 2020/8/16 9:55
 * project name: javase
 * Version:
 * Description:
 */
public class MyThread extends Thread {

    /**
     * 重写Thread类中的run方法，设置线程任务
     */
    @Override
    public void run() {
        //获取线程名称
        //System.out.println(getName());

        //获取线程的第二种方法
        System.out.println(Thread.currentThread().getName());
    }

    /**
     * 获取线程的名称
     * 1、使用getName()方法,String getName()返回当前该线程的名称
     * 2、可以先获取到当前正在执行的线程，使用线程中的方法getName()获取该线程的名称
     */
    @Test
    public void getNameTest() {
    }
}
