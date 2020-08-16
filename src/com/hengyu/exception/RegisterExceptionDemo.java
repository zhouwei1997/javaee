package com.hengyu.exception;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.thread
 * ClassName: RegisterException
 * Author: hengyu
 * Date: 2020/8/13 20:23
 * project name: javase
 * Version:
 * Description:模拟注册操作，如果用户名已存在，则抛出异常信息
 */
public class RegisterExceptionDemo {

    /**
     * 使用数组保存已经注册过的用户名
     */
    static String[] usernames = {"张三", "李四", "王文英", "刘小强"};

    public static void main(String[] args) throws RegisterException {
        //使用Scanner获取用户输入的注册的用户名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要注册的用户名：");
        String username = scanner.next();
        checkUsername(username);
    }

    /**
     * 对用户输入的注册的用户名进行判断
     */
    private static void checkUsername(String username) throws RegisterException {
        //遍历存储已经注册过的用户名数组，获取每一个用户名
        for (String name : usernames) {
            if (name.equals(username)) {
                //用户名操作，抛出RegisterException异常
                throw new RegisterException("该用户名已被注册");
            }
        }
    }
}
