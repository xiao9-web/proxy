package com.zwj.study;

/**
 * 静态代理
 */
public class HelloProxy implements HelloInterface {
    private HelloInterface helloInterface = new HelloInterfaceImpl();
    @Override
    public void sayHello() {
        System.out.println("你好之前！");
        helloInterface.sayHello();
        System.out.println("你好之后！");
    }
}
