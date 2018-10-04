package com.jimisun.spring.example3;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 07:53 2018-09-27
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        BeautifulGirl beautifulGirl = new BeautifulGirl(new EatAction());
        beautifulGirl.action();
    }
}
