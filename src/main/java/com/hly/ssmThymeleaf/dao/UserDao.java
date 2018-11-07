package com.hly.ssmThymeleaf.dao;


import com.hly.ssmThymeleaf.entity.User;

/**
 * @author :hly
 * @github :github.com/SiriusHly
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/8/30
 */
public interface UserDao {

    /**
     * 查询用户
     * @param userId
     * @return
     */
    public User getUserById(String userId);

}
