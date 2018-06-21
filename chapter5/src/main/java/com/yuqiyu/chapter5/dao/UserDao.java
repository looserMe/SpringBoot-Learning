package com.yuqiyu.chapter5.dao;

import com.yuqiyu.chapter5.vo.UserVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * <p>SpringBoot使用SpringDataJPA完成CRUD</p>
 *
 * @author wim
 * @version 1.0
 * @since 2018年04月20日
 */
public interface UserDao extends JpaRepository<UserVo, String>, JpaSpecificationExecutor<UserVo>, Serializable {
}
