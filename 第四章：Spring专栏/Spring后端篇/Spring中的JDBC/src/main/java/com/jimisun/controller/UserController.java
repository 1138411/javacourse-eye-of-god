package com.jimisun.controller;

import com.jimisun.domain.User;
import com.jimisun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 16:10 2018-10-25
 * @Modified By:
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable("id") String username) {
        User user = userService.getUser(username);
        return user;
    }


}
