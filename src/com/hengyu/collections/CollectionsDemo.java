package com.hengyu.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.collections
 * ClassName: CollectionsDemo
 * Author: hengyu
 * Date: 2020/8/11 22:33
 * project name: javase
 * Version:
 * Description:Collections集合工具类
 */
public class CollectionsDemo {

    private ArrayList<String> list = new ArrayList<>();

    /**
     * 使用public static <T> boolean addAll(Collection<T> c,T... elements)向集合中添加多个元素
     */
    @Test
    public void addAllTest() {
        Collections.addAll(list, "a", "b", "c", "d", "e");
        System.out.println(list);
    }

    /**
     * 使用public static void shuffle(List<?> list)打乱集合中的顺序
     */
    @Test
    public void shuffleTest() {
        addAllTest();
        Collections.shuffle(list);
        System.out.println(list);
    }

    /**
     * 使用public static <T> void sort(List<T> list);对集合中的元素进行排序
     */
    @Test
    public void sortTest(){
        Collections.addAll(list, "1", "3", "2", "9", "8");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
