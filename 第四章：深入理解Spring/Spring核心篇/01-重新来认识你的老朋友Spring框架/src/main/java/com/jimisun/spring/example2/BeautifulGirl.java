package com.jimisun.spring.example2;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 07:44 2018-09-27
 * @Modified By:
 */
public class BeautifulGirl implements Girl {

    private EatAction eat;


    public BeautifulGirl() {
        this.eat = new EatAction();
    }

    @Override
    public void action() {
        eat.action();
    }
}
