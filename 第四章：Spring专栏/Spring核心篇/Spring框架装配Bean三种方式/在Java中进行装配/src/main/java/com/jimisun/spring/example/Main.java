package com.jimisun.spring.example;

import com.jimisun.spring.config.WebConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 08:09 2018-10-01
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(WebConfig.class);
        User bean = annotationConfigApplicationContext.getBean(User.class);
        bean.action();
    }
}
