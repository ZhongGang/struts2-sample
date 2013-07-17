package com.icode.cglib;


import org.springframework.cglib.proxy.Enhancer;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-17
 * Time: 下午5:41
 */
public class Talker {

    public void talk(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Talker.class);
        enhancer.setCallback(new EnhanceTalker());
        Talker talker = (Talker) enhancer.create();
        talker.talk("this is cglib proxy~");

        System.out.println(talker.getClass());
    }
}
