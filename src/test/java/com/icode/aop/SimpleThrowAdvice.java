package com.icode.aop;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-16
 * Time: 下午10:37
 */
public class SimpleThrowAdvice implements ThrowsAdvice {

    public void afterThrowing(UnsupportedOperationException uoe) throws Throwable {
        System.out.println("Advice an exception occurs~~~");
    }


    public static void main(String[] args) {
        Speaker speaker = new Speaker();

        SimpleThrowAdvice throwAdvice = new SimpleThrowAdvice();

        ProxyFactory proxyFactory = new ProxyFactory(speaker);
        proxyFactory.addAdvice(throwAdvice);

        Speaker proxySpeaker = (Speaker) proxyFactory.getProxy();

//        speaker.forbidSpeak();

        proxySpeaker.forbidSpeak();
    }
}
