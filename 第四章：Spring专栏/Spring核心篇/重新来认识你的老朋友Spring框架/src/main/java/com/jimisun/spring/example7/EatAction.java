package com.jimisun.spring.example7;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 07:49 2018-09-27
 * @Modified By:
 */
public class EatAction implements Action {

    @Override
    public void action() {
        System.out.println("吃东西动作执行.......");
    }
}
