package com.threewater.service;

import com.threewater.dao.UserMapper;
import com.threewater.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Yessirskiii
 * @Date: 2022/03/30/19:04
 * @Description:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }

}
