package com.hengyu.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection接口
 * 所有单列集合的最顶层的接口，里面定义了所有单列集合共性的方法
 * 任意的单列集合都可以使用Collection中的方法
 */
public class CollectionDemo {

    //创建集合对象
    private Collection<String> collection = new ArrayList<>();

    /**
     * public boolean add(E e);
     * 把给定的对象添加到集合中，
     * 返回值是一个Boolean值，一般都是返回true，所以可以不用接收
     */
    @Test
    public void addMethodTest() {
        publicMethod();
        System.out.println(collection);
        System.out.println(collection.size());
        collection.add("黄渤");
        collection.add("肖战");
        System.out.println(collection);
        System.out.println(collection.size());
    }

    /**
     * public boolean remove(E e);
     * 把给定的对象从集合中删除
     * 返回值是一个Boolean值，一般都是返回true，所以可以不用接收
     */
    @Test
    public void removeMethodTest() {
        publicMethod();
        System.out.println(collection);
        System.out.println(collection.size());
        collection.remove("范冰冰");
        System.out.println(collection);
        System.out.println(collection.size());
    }

    /**
     * 公共类方法
     * 创始元素集合
     */
    private void publicMethod() {
        collection.add("张三丰");
        collection.add("李易峰");
        collection.add("迪丽热巴");
        collection.add("范冰冰");
    }

    /**
     * public boolean contains(E e);
     * 判断当前集合中是否包含给定对象
     * 包含则返回true，不包含则返回false
     */
    @Test
    public void containsMethodTest() {
        publicMethod();
        System.out.println(collection);
        System.out.println(collection.contains("范冰冰"));
        collection.remove("范冰冰");
        System.out.println(collection);
        System.out.println(collection.contains("范冰冰"));
    }

    /**
     * public boolean isEmpty();
     * 判断当前集合是否为空集合
     * 空集合返回true，否则返回false
     */
    @Test
    public void isEmptyMethodTest() {
        publicMethod();
        System.out.println(collection.isEmpty());
    }

    /**
     * public boolean size();
     * 返回集合中元素的个数
     */
    @Test
    public void sizeMethodTest() {
        publicMethod();
        System.out.println(collection.size());
    }

    /**
     * public boolean clear();
     * 清空集合中的所有元素
     */
    @Test
    public void clearMethodTest() {
        publicMethod();
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());
        System.out.println(collection);
    }
}
