package com.threewater.dao;

import com.threewater.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Yessirskiii
 * @Date: 2022/03/30/16:54
 * @Description:
 */
@Mapper
public interface DiscussPostMapper {

    // 分页查询帖子
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // 查询帖子的行数
    // @Param注解用于给参数取别名
    // 如果只有一个参数，并且在<if>里使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
