package com.icode.web.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.components.File;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-15
 * Time: 下午9:32
 */
public class AvatarAction extends ActionSupport {

    private File avatar;
    private String avatarContentType;
    private String avatarFileName;

    public String execute() {
        return Action.SUCCESS;
    }

    public String upload() {
        return Action.SUCCESS;
    }

    public void validateUpload() {
        if (avatar == null) {
            this.addFieldError("avatar", "The file can not be empty, please select one file!");
        }
    }

    public File getAvatar() {
        return avatar;
    }

    public void setAvatar(File avatar) {
        this.avatar = avatar;
    }

    public String getAvatarContentType() {
        return avatarContentType;
    }

    public void setAvatarContentType(String avatarContentType) {
        this.avatarContentType = avatarContentType;
    }

    public String getAvatarFileName() {
        return avatarFileName;
    }

    public void setAvatarFileName(String avatarFileName) {
        this.avatarFileName = avatarFileName;
    }
}
