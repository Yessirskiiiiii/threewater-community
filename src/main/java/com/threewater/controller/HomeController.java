package com.threewater.controller;

import com.threewater.entity.DiscussPost;
import com.threewater.entity.User;
import com.threewater.service.DiscussPostService;
import com.threewater.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Yessirskiii
 * @Date: 2022/03/30/19:12
 * @Description:
 */
@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private DiscussPostService discussPostService;

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String getIndexPage(Model model) {
        List<DiscussPost> list = discussPostService.findDiscussPosts(0, 0, 10);
        List<Map<String, Object>> discussPosts = new ArrayList<>();
        if (list != null) {
            for (DiscussPost discussPost : list) {
                HashMap<String, Object> map = new HashMap<>();
                map.put("post", discussPost);
                User user = userService.findUserById(discussPost.getUserId());
                map.put("user", user);
                discussPosts.add(map);
            }
        }
        model.addAttribute("discussPosts", discussPosts);
        return "/index";
    }

}
