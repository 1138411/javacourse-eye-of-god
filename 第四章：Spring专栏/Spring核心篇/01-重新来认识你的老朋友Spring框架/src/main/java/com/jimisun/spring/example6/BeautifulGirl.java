package com.jimisun.spring.example6;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 07:44 2018-09-27
 * @Modified By:
 */
public class BeautifulGirl implements Girl {

    private Action action;

    private Parent parent;

    public BeautifulGirl(Action action, Parent parent) {
        this.action = action;
        this.parent = parent;
    }

    @Override
    public void action() {
        parent.check();
        action.action();
    }
}
