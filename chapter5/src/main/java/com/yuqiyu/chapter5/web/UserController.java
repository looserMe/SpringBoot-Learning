package com.yuqiyu.chapter5.web;

import com.yuqiyu.chapter5.dao.UserDao;
import com.yuqiyu.chapter5.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户Controller
 *
 * @author wim
 * @version 1.0
 * @since 2018年04月20日
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<UserVo> list() {
        return userDao.findAll();
    }
}
