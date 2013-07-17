package com.icode.aop;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-17
 * Time: 下午3:55
 */
public class DefaultCounterImpl implements Counter {
    private int count = 0;

    @Override
    public void add() {
        count += 1;
    }

    @Override
    public int count() {
        return count;
    }
}
