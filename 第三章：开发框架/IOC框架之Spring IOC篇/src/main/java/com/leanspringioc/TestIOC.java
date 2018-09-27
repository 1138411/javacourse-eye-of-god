package com.leanspringioc;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 19:37 2018-09-21
 * @Modified By:
 */
public class TestIOC {

    
    private IUser iUser;

    public IUser getiUser() {
        return iUser;
    }

    public void setiUser(IUser iUser) {
        this.iUser = iUser;
    }


    /**
     * 测试IOC注入的iUser的say方法
     */
    void say() {
        iUser.say();
    }

}
