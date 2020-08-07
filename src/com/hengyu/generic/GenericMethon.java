package com.hengyu.generic;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.generic
 * ClassName: GenericMethon
 * Author: hengyu
 * Date: 2020/8/7 22:28
 * project name: javase
 * Version:
 * Description:
 * 定义含有泛型的方法，泛型定义在方法的修饰符和返回值类型之间
 * <p>
 * 格式：
 * 修饰符 <泛型> 返回值类型 方法名 (参数列表){
 * 方法体；
 * }
 * <p>
 * 含有泛型的方法在调用方法的时候确定泛型的数据类型
 * 传递什么类型的参数，泛型就是什么类型
 */
public class GenericMethon {

    /**
     * 定义一个含有泛型的方法
     */
    public <M> void method01(M m) {
        System.out.println(m);
    }

    /**
     * 定义一个含有泛型的静态方法
     */
    public static <S> void method02(S s) {
        System.out.println(s);
    }
}
