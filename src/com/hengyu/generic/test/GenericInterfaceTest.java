package com.hengyu.generic.test;

import com.hengyu.generic.GenericInterfaceImpl;
import com.hengyu.generic.GenericInterfaceImpl_02;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.generic.test
 * ClassName: GenericInterfaceTest
 * Author: hengyu
 * Date: 2020/8/9 16:18
 * project name: javase
 * Version:
 * Description: 测试含有泛型的接口
 */
public class GenericInterfaceTest {

    /**
     * 测试GenericInterfaceImpl方法
     */
    @Test
    public void genericInterfacceImplTest(){
        //创建GenericInterfaceImpl对象
        GenericInterfaceImpl genericInterface=new GenericInterfaceImpl();
        genericInterface.method("字符串");
    }

    @Test
    public void genericInterfacceImpl02Test(){
        //创建GenericInterfaceImpl对象
        GenericInterfaceImpl_02<Integer> genericInterface=new GenericInterfaceImpl_02<>();
        genericInterface.method(10);
    }
}
