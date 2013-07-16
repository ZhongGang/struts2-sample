package com.icode.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-16
 * Time: 下午10:34
 */
public class SimpleAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("This is an after advice~~~");
    }

    public static void main(String[] args) {
        Speaker speaker = new Speaker();

        SimpleAfterAdvice afterAdvice = new SimpleAfterAdvice();

        ProxyFactory proxyFactory = new ProxyFactory(speaker);
        proxyFactory.addAdvice(afterAdvice);

        Speaker proxySpeaker = (Speaker) proxyFactory.getProxy();

        speaker.speak();

        proxySpeaker.speak();
    }
}
