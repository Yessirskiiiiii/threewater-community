package com.threewater.dao;

import com.threewater.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Yessirskiii
 * @Date: 2022/03/30/15:48
 * @Description:
 */
@Mapper
public interface UserMapper {

    // 根据id查询用户
    User selectById(int id);

    // 根据名字查询用户
    User selectByName(String username);

    // 根据邮箱查询用户
    User selectByEmail(String email);

    // 增加一个用户
    int insertUser(User user);

    // 更新用户状态
    int updateStatus(int id, int status);

    // 更新用户头像
    int updateHeader(int id, String headerUrl);

    // 更新用户密码
    int updatePassword(int id, String password);

}
