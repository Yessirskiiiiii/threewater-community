package com.threewater.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: Yessirskiii
 * @Date: 2022/04/11/15:15
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginTicket {

    private int id;
    private int userId;
    private String ticket;
    private int status;
    private Date expired;

}
