package com.jimisun.spring.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 08:09 2018-10-01
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringExample.xml");
        User bean = applicationContext.getBean(User.class);
        bean.action();
    }
}
