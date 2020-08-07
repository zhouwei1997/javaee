package com.hengyu.generic.test;

import com.hengyu.generic.GenericClass;
import com.hengyu.generic.GenericMethon;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.generic.test
 * ClassName: GenericMethonTest
 * Author: hengyu
 * Date: 2020/8/7 22:33
 * project name: javase
 * Version:
 * Description:
 */
public class GenericMethonTest {

    /**
     * 调用含有泛型的方法
     */
    @Test
    public void method01() {
        GenericMethon genericMethon = new GenericMethon();
        genericMethon.method01(10);
        genericMethon.method01("abc");
        genericMethon.method01(8.8);
        genericMethon.method01(true);
    }

    /**
     * 调用含有泛型的静态方法
     */
    @Test
    public void method02() {
        GenericMethon.method02("静态方法，不建议创建对象时使用");
        GenericMethon.method02(1);
    }
}
