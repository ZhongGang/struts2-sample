package com.icode.web.action;

import com.opensymphony.xwork2.Action;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-15
 * Time: 下午5:03
 */
public class HelloWorldAction {
    private String message;

    public String execute() {
        message = "Hello World! This is my first web application based on struts2";
        return Action.SUCCESS;
    }

    public String getMessage() {
        return message;
    }
}
