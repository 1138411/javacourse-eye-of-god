package com.jimisun.spring.example;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 11:11 2018-10-04
 * @Modified By:
 */
public class MyArticle implements Article {


    @Override
    public void action() {
        System.out.println("this is my Article");
    }
}
