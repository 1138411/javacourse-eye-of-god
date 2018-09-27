package com.jimisun.spring.example4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 07:53 2018-09-27
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringExample4.xml");
        BeautifulGirl beautifulGirl = (BeautifulGirl) context.getBean("beautifulGirl");
        beautifulGirl.action();
        context.close();
    }
}
