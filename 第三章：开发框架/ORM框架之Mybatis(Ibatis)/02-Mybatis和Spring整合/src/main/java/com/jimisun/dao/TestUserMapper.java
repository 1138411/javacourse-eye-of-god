package com.jimisun.dao;

import com.jimisun.domain.TestUser;
import org.apache.ibatis.annotations.Select;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 08:34 2018-09-24
 * @Modified By:
 */
public interface TestUserMapper {

    @Select(" SELECT * from user where id = #{id};")
    TestUser selectOne(Integer id);

}
