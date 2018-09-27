package com.leanspringioc;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 19:36 2018-09-21
 * @Modified By:
 */
public class AdminUser implements IUser {

    
    @Override
    public void say() {
        System.out.println("我是Admin");
    }
}
