package com.icode.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-17
 * Time: 下午5:48
 */
public class EnhanceTalker implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("11111111111111111111111");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("22222222222222222222222");
        return result;
    }
}
