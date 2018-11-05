package com.jimisun.service;

import com.jimisun.domain.User;
import org.springframework.stereotype.Service;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 16:12 2018-10-25
 * @Modified By:
 */
public interface UserService {

    User getUser(String username);

}
