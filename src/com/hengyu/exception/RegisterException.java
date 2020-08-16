package com.hengyu.exception;

/**
 * Created with IntelliJ IDEA.
 * PackgeName: com.hengyu.thread
 * ClassName: RegisterException
 * Author: hengyu
 * Date: 2020/8/13 20:23
 * project name: javase
 * Version:
 * Description:自定义异常
 * <p>
 * 自定义异常需要继承Exception或者RuntimeException
 */
public class RegisterException extends Exception {

    /**
     * 添加一个空参数的构造方法
     */
    public RegisterException() {
    }

    /**
     * 添加一个带异常信息的构造方法
     * 所有异常类都会有一个带异常信息的构造方法，方法内部会调用父类异常信息的构造方法，让父类来处理这个异常信息
     */
    public RegisterException(String message) {
        super(message);
    }

}
