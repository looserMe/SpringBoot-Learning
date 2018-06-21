package com.yuqiyu.chapter.util;

/**
 * <p>邮件内容的类型1.html 2.text</p>
 *
 * @author wim
 * @version 1.0
 * @since 2018年04月24日
 */
public enum MailContentTypeEnum {
    HTML("text/html;charset=UTF-8"),
    TEXT("text");

    private String value;

    MailContentTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
