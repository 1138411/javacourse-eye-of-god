package com.jimisun.spring.example5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 07:53 2018-09-27
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        SleepAction action = applicationContext.getBean(SleepAction.class);
        action.action();
    }
}
