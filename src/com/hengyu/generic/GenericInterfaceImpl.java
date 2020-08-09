package com.hengyu.generic;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.generic
 * ClassName: GenericInterfaceImpl
 * Author: hengyu
 * Date: 2020/8/9 16:11
 * project name: javase
 * Version:
 * Description: 含有泛型的接口
 * <p>
 * 使用方式1：定义接口的实现类，实现接口，指定接口的泛型
 * public interface Iterator<E> {
 * E next();
 * }
 * Scanner实现了Iterator接口，并指定泛型的接口为String，所以重写了next方法
 * public final class Scanner implements Iterator<String>{
 * public String next(){}
 * }
 */
public class GenericInterfaceImpl implements GenericInterface<String> {

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
