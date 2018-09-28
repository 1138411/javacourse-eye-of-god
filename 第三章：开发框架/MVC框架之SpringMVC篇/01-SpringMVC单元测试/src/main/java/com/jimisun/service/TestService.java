package com.jimisun.service;

import org.springframework.stereotype.Service;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 07:48 2018-09-25
 * @Modified By:
 */
@Service
public class TestService {


    public String sayHelloService(String username) {
        return username + "hello";
    }
}
