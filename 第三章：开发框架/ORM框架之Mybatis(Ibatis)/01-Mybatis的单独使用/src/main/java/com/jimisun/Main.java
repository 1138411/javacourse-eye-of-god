package com.jimisun;

import com.jimisun.dao.TestUserMapper;
import com.jimisun.domain.TestUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 08:37 2018-09-24
 * @Modified By:
 */
public class Main {


    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TestUserMapper mapper = sqlSession.getMapper(TestUserMapper.class);
        TestUser testUser = mapper.selectOne(1);
        System.out.println(testUser.toString());
    }
}
