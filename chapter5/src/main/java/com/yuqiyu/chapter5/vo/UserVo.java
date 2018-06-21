package com.yuqiyu.chapter5.vo;

import javax.persistence.*;

/**
 * 用户实体
 *
 * @author wim
 * @version 1.0
 * @since 2018年04月20日
 */
@Entity
@Table(name = "sys_user")
public class UserVo {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;

    @Column(name = "sex")
    private String sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
