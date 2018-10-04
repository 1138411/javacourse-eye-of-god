package com.jimisun.spring.example6;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 07:49 2018-09-27
 * @Modified By:
 */
public class SleepAction implements Action {

    @Override
    public void action() {
        System.out.println("睡觉动作执行.......");
    }
}
