package com.jimisun.service;

import com.jimisun.dao.UserDao;
import com.jimisun.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 16:14 2018-10-25
 * @Modified By:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User getUser(String username) {
        return userDao.getUser(username);
    }


}
