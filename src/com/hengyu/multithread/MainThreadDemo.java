package com.hengyu.multithread;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.multithread
 * ClassName: MainThreadDemo
 * Author: hengyu
 * Date: 2020/8/15 14:17
 * project name: javase
 * Version:
 * Description:
 * <p>
 * 主线程：执行主方法的线程
 * <p>
 * 单线程程序：java程序中只有一个线程。执行从main方法开始，从上到下依次执行
 */
public class MainThreadDemo {

    public static void main(String[] args) {
        Person person01 = new Person("小强");
        person01.run();
        Person person02 = new Person("旺财");
        person02.run();
    }
}
