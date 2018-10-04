package com.jimisun.spring.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 14:36 2018-09-29
 * @Modified By:
 */
@Component
public class User {

    @Autowired
    private Article article;

    public void action() {
        article.action();
    }
}
