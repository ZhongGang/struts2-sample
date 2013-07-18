package com.icode.cglib;


import org.springframework.cglib.proxy.Enhancer;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-17
 * Time: 下午5:41
 */
public class Talker {

    public static int count = 0;

    public void talk(String message) {
        System.out.println(message);
    }

    public static void say(String words) {
        System.out.println(words);
    }

    public final void speak(String words) {
        System.out.println(words);
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Talker.class);
        enhancer.setCallback(new EnhanceTalker());
        Talker talker = (Talker) enhancer.create();
        talker.talk("this is cglib proxy~");
        Talker.say("CGLIB proxy~");
        talker.say("CGLIB proxy~");
        talker.speak("Speak: CGLIB proxy~");
        System.out.println(talker.getClass());
    }
}
