package com.threewater;

import com.threewater.dao.DiscussPostMapper;
import com.threewater.dao.UserMapper;
import com.threewater.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author: Yessirskiii
 * @Date: 2022/03/30/16:09
 * @Description:
 */

@SpringBootTest
public class MapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussMapper;

    @Test
    public void testSelectUser() {
        System.out.println(userMapper.selectById(101));
    }

    @Test
    public void testSelectPosts() {
        List<DiscussPost> list = discussMapper.selectDiscussPosts(149, 0, 10);
        for (DiscussPost discussPost : list) {
            System.out.println(discussPost);
        }

        int rows = discussMapper.selectDiscussPostRows(149);
        System.out.println(rows);
    }

}
