package com.icode.aop;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-16
 * Time: 下午10:27
 */
@Component
public class Speaker {

    public void speak() {
        System.out.println("Hello World!");
    }

    public void forbidSpeak() {
        throw new UnsupportedOperationException("Not yet implemented!");
    }
}
