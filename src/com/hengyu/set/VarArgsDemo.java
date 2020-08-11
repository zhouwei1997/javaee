package com.hengyu.set;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.set
 * ClassName: VarArgsDemo
 * Author: hengyu
 * Date: 2020/8/11 22:10
 * project name: javase
 * Version:
 * Description: 可变参数
 */
public class VarArgsDemo {

    public static void main(String[] args) {
        int i = add(10, 20, 30, 45, 65);
        System.out.println(i);
    }

    /**
     * 定义一个方法，计算两个int类型的整数的和
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * 定义计算（0-n）整数的和的方法
     * 已知：计算整数的和，数据类型已经确定，但是参数的个数不确定
     */
    public static int add(int... arr) {
        System.out.println(arr);
        System.out.println(arr.length);
        //定义一个初始化的变量，记录累加求和
        int sum = 0;
        //遍历数组，获取数组中的每一个元素
        for (int i : arr) {
            //累计求和
            sum += i;
        }
        return sum;
    }
}
