package com.threewater;

import com.threewater.dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: Yessirskiii
 * @Date: 2022/03/30/16:09
 * @Description:
 */

@SpringBootTest
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectUser() {
        System.out.println(userMapper.selectById(101));
    }

}
