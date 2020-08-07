package com.hengyu.generic;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.generic
 * ClassName: GenericClass
 * Author: hengyu
 * Date: 2020/8/7 22:13
 * project name: javase
 * Version:
 * Description:
 * 定义一个含有泛型的类，模拟ArrayList集合
 * 泛型是一个未知的数据类型，当我们不确定是什么类型的时候，可以使用泛型
 * 泛型可以接收任意的数据类型，可以使用Integer、String。。。。
 * 创建对象的时候确定泛型的数据类型
 */
public class GenericClass<E> {

    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
