package com.jimisun.spring.example5;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 07:44 2018-09-27
 * @Modified By:
 */
public class BeautifulGirl implements Girl {

    private Action action;

    public BeautifulGirl(Action action) {
        this.action = action;
    }

    @Override
    public void action() {
        action.action();
    }
}
