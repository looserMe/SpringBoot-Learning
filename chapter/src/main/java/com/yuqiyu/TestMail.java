package com.yuqiyu;

import com.yuqiyu.chapter.entity.MailSender;
import com.yuqiyu.chapter.util.MailContentTypeEnum;

import java.util.ArrayList;

/**
 * 测试SpringBoot发送邮件
 *
 * @author wim
 * @version 1.0
 * @since 2018年04月24日
 */
public class TestMail {

    public static void main(String[] args) throws Exception {
        new MailSender().title("测试SpringBoot发送邮件").content("简单文本内容发送").contentType(MailContentTypeEnum.TEXT).targets(new ArrayList<String>() {
            {
                add("984667232@qq.com");
            }
        }).send();
    }
}
