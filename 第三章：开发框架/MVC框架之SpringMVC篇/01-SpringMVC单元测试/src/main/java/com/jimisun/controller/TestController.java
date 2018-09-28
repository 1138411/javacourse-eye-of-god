package com.jimisun.controller;

import com.jimisun.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequestMapping("sayhello")
    public void sayhello(String username) {
        String s = testService.sayHelloService(username);
        System.out.println(s);
    }
}
