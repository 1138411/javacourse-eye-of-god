package com.leanspringioc;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 19:44 2018-09-21
 * @Modified By:
 */
public class VipUser implements IUser {
    @Override
    public void say() {
        System.out.println("我是Vip");
    }
}
