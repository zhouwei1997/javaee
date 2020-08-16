package com.example.synchronize;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.example.ticket
 * ClassName: Ticket
 * Author: hengyu
 * Date: 2020/8/16 10:41
 * project name: javase
 * Version:
 * Description:
 */
public class Ticket {

    public static void main(String[] args) {
        //创建Runnable接口实现类
        TickerImpl ticker = new TickerImpl();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread thread_01 = new Thread(ticker);
        Thread thread_02 = new Thread(ticker);
        Thread thread_03 = new Thread(ticker);
        //调用start开启
        thread_01.start();
        thread_02.start();
        thread_03.start();
    }

}
