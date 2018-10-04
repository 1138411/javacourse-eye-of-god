package com.jimisun.spring.config;

import com.jimisun.spring.example.Article;
import com.jimisun.spring.example.MyArticle;
import com.jimisun.spring.example.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 19:34 2018-10-01
 * @Modified By:
 */
@Configuration
@ComponentScan("com.jimisun")
public class WebConfig {

    @Bean
    public User user() {
        return new User(myArticle());
    }

    @Bean
    public MyArticle myArticle() {
        return new MyArticle();
    }

}
