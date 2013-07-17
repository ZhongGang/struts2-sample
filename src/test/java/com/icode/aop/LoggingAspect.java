package com.icode.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-17
 * Time: 上午12:39
 * <p/>
 * 代理对象的方法 = 增强处理 + 被代理对象的方法
 */
@Aspect
public class LoggingAspect {

    @Before(value = "execution(* com.icode.aop..*.*(..))")
    public void beforeLog() throws Throwable {
        System.out.println("~~~~before log~~~~~");
    }

    @Around(value = "execution(* com.icode.aop..*.*(..))")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("~~~~~begin to log~~~~~");
        Object result = pjp.proceed();
        System.out.println("~~~~~end to log~~~~~");
        return result;
    }

    @After(value = "execution(* com.icode.aop..*.*(..))")
    public void afterLog() throws Throwable {
        System.out.println("~~~~after log~~~~~");
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:testApplicationContext.xml");
        Speaker speaker = (Speaker) applicationContext.getBean("speaker");
        speaker.speak();
    }
}
