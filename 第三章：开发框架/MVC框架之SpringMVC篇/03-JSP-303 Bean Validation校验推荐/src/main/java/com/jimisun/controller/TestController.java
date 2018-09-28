package com.jimisun.controller;

import com.jimisun.domain.User;
import com.jimisun.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 07:49 2018-09-25
 * @Modified By:
 */
@Controller
@RequestMapping("/")
public class TestController {

    @Autowired
    private TestService testService;
    
    @RequestMapping("sayhello")
    public void sayhello(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
        } else {
            String s = testService.sayHelloService(user.getUsername());
            System.out.println(s);
        }
    }
}
