package com.threewater.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: Yessirskiii
 * @Date: 2022/03/30/16:51
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscussPost {

    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int commentCount;
    private double score;

}
