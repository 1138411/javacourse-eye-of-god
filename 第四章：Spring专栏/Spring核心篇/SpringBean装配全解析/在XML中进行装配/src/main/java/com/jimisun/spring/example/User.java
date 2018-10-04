package com.jimisun.spring.example;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 14:36 2018-09-29
 * @Modified By:
 */
public class User {

    private Article article;

    public User(Article article) {
        this.article = article;
    }


    public void action() {
        article.action();
    }
}
