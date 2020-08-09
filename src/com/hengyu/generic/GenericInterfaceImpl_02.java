package com.hengyu.generic;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.generic
 * ClassName: GenericInterfaceImpl_02
 * Author: hengyu
 * Date: 2020/8/9 16:44
 * project name: javase
 * Version:
 * Description:
 * 含有泛型的接口第二种使用方式：接口使用什么泛型，实现类就使用什么泛型
 */
public class GenericInterfaceImpl_02<I> implements GenericInterface<I> {

    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
