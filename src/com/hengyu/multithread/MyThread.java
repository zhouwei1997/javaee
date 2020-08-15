package com.hengyu.multithread;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.multithread
 * ClassName: MyThread
 * Author: hengyu
 * Date: 2020/8/15 15:13
 * project name: javase
 * Version:
 * Description:
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        for(int i = 0; i <20 ; i++) {
            System.out.println(i);
        }
    }
}
