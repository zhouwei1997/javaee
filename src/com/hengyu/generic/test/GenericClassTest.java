package com.hengyu.generic.test;

import com.hengyu.generic.GenericClass;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.generic.test
 * ClassName: GenericClassTest
 * Author: hengyu
 * Date: 2020/8/7 22:16
 * project name: javase
 * Version:
 * Description: 泛型类的测试类
 */
public class GenericClassTest {

    /**
     * 不写泛型默认为Object类型
     */
    @Test
    public void stringTest() {
        GenericClass genericClass = new GenericClass();
        genericClass.setName("只能是字符串");
        Object object = genericClass.getName();
        System.out.println(object);
    }

    /**
     * 创建GenericClass对象，泛型使用Integer类型
     */
    @Test
    public void useGenericTest() {
        GenericClass<Integer> genericClass = new GenericClass<>();
        genericClass.setName(1);
        Integer name = genericClass.getName();
        System.out.println(name);
    }

    /**
     * 创建GenericClass对象，泛型使用String类型
     */
    @Test
    public void useGenericStringTest() {
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.setName("小明");
        String name = genericClass.getName();
        System.out.println(name);
    }
}
