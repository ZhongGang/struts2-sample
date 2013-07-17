package com.icode.aop;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-16
 * Time: 下午10:29
 */
public class SimpleBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("This is a before advice~~~~");
    }


    public static void main(String[] args) {
        Speaker speaker = new Speaker();

        SimpleBeforeAdvice beforeAdvice = new SimpleBeforeAdvice();

        ProxyFactory proxyFactory = new ProxyFactory(speaker);
        proxyFactory.addAdvice(beforeAdvice);

        Speaker proxySpeaker = (Speaker) proxyFactory.getProxy();

        speaker.speak();

        proxySpeaker.speak();

        System.out.println(proxySpeaker.getClass());
    }
}
