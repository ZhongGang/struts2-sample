package com.icode.core;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-16
 * Time: 下午9:08
 */
public class TraceInterceptor implements MethodInterceptor {

    private static final Log logger = LogFactory.getLog(TraceInterceptor.class);

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        String methodName = invocation.getMethod().getName();
        logger.debug("Transaction is to begin before the service method named " + methodName + " invoked~~~~~");
        Object proceed = invocation.proceed();
        logger.debug("Transaction has ended after the service method named " + methodName + " invoked~~~~");
        return proceed;
    }
}
