package com.jimisun.controller;

import com.jimisun.domain.User;
import com.jimisun.domain.UserValidator;
import com.jimisun.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @InitBinder
    protected void dataValidateBinder(WebDataBinder binder) {
        binder.setValidator(new UserValidator());
    }

    @RequestMapping("sayhello")
    public void sayhello(@Validated User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
        } else {
            String s = testService.sayHelloService(user.getUsername());
            System.out.println(s);
        }
    }
}
