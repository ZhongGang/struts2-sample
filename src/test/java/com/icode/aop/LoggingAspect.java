package com.icode.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-17
 * Time: 上午12:39
 *
 * 代理对象的方法 = 增强处理 + 被代理对象的方法
 */
@Aspect
public class LoggingAspect {

    @Around(value = "execution(* com.icode.aop..*.*(..))")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Before");
        Object result = pjp.proceed();
        System.out.println("After");
        return result;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:testApplicationContext.xml");
        Speaker speaker = (Speaker) applicationContext.getBean("speaker");
        speaker.speak();
    }
}
