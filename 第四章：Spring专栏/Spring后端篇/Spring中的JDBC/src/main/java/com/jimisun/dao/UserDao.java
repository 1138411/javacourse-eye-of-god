package com.jimisun.dao;

import com.jimisun.domain.User;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 16:15 2018-10-25
 * @Modified By:
 */
public interface UserDao {
    User getUser(String username);

}
