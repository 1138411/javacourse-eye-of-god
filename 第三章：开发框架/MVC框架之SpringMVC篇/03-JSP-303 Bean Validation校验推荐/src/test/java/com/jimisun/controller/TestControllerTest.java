package com.jimisun.controller;

import com.jimisun.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 07:58 2018-09-25
 * @Modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:SpringMvc.xml",
})
public class TestControllerTest {

    @Autowired
    private TestService testService;

    @Test
    public void sayhello() {
        String test = testService.sayHelloService("test");
        System.out.println(test);
    }
}