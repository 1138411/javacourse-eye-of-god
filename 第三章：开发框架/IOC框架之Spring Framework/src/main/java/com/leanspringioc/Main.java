package com.leanspringioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 19:39 2018-09-21
 * @Modified By:
 */
public class Main {


    /**
     * 在applicationContext.xml文件中向testIOCBean中注入vipUser和adminUser进行测试
     *
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestIOC testIOC = (TestIOC) context.getBean("testIOC");
        testIOC.say();
    }
}
