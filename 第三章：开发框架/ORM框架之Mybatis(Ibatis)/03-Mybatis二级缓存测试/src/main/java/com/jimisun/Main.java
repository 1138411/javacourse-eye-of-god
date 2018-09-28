package com.jimisun;

import com.jimisun.dao.TestUserMapper;
import com.jimisun.domain.TestUser;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 08:37 2018-09-24
 * @Modified By:
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        TestUserMapper testUserMapper = (TestUserMapper) context.getBean("testUserMapper");
        /*测试缓存：先查询此时username为jimisun*/
        TestUser testUser = testUserMapper.selectOne(1);
        /*测试缓存：修改username为lisi*/
        Integer integer = testUserMapper.updateOne(1);
        /*测试缓存：最后查询查看是否从数据库获取还是从缓存获取*/
        TestUser resultUser = testUserMapper.selectOne(1);
        System.out.println(resultUser.toString());
    }
}
