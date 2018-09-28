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
        TestUser testUser = testUserMapper.selectOne(1);
        System.out.println(testUser.toString());
    }
}
