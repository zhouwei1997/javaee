package com.example.ticket;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.example.ticket
 * ClassName: TickerImpl
 * Author: hengyu
 * Date: 2020/8/16 10:37
 * project name: javase
 * Version:
 * Description:
 */
public class TickerImpl implements Runnable {

    //定义一个票量池
    private int ticket = 100;

    @Override
    public void run() {

        //创建循环，卖票操作重复
        while (true) {
            //判断票是否存在
            if (ticket > 0) {

                try {
                    //提高程序安全性，让程序睡眠
                    Thread.sleep(10000);
                    //存在，卖票
                    System.out.println(Thread.currentThread().getName() + "正在出售第：" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
