package com.jimisun;

import com.jimisun.dao.TestUserMapper;
import com.jimisun.domain.dto.MyDto;
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
        /*这里返回值是在mapper.xml中自定义resultMap的返回值类型*/
        MyDto myDto = testUserMapper.selectOne(1);
        System.out.println(myDto.toString());
    }
}
