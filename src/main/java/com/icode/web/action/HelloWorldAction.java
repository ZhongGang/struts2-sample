package com.icode.web.action;

import com.icode.web.dto.Message;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-15
 * Time: 下午5:03
 */
public class HelloWorldAction {
    private Message message;

    public String execute() {
        return Action.SUCCESS;
    }

    public String source() {
        return "source";
    }

    public String scope() {
        ActionContext context = ActionContext.getContext();
        context.getApplication().put("name", "Application-ZhongGang");
        context.getSession().put("name", "Session-ZhongZhong");
        context.put("name", "Request-GangGang");
        return "scope";
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
