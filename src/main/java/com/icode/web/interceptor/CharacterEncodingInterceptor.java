package com.icode.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-15
 * Time: 下午9:48
 */
public class CharacterEncodingInterceptor implements Interceptor {

    @Override
    public void init() {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        return invocation.invoke();
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not yet implemented!");
    }
}
