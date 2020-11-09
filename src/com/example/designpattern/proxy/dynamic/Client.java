package com.example.designpattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * Author: Dongping Wang
 * Date: 2020/11/8
 * Description:情景类
 */
public class Client {
    public static void main(String[] args) {
        Scalper scalper =  new MiFan();
        // scalper.buyEasy();
        IMiPhone proxy = (IMiPhone) Proxy.newProxyInstance(scalper.getClass().getClassLoader(),
                scalper.getClass().getInterfaces(),
                new MyInvocationHandler(scalper));
        proxy.buy();

    }
}
