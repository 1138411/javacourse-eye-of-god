package com.jimisun.dao;

import com.jimisun.domain.TestUser;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 08:34 2018-09-24
 * @Modified By:
 */
public interface TestUserMapper {

    TestUser selectOne(Integer id);

    Integer updateOne(Integer id);

}
