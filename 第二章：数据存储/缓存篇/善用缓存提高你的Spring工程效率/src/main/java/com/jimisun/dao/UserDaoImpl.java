package com.jimisun.dao;

import com.jimisun.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 16:15 2018-10-25
 * @Modified By:
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcOperations jdbcOperations;

    private static final String SELECT_USER_BY_ID = "select * from user where username = ?";

    private static final String ADD_USER = "INSERT INTO user VALUES(?,?)";

    @Override
    public User getUser(String username) {
        System.out.println("查询了一次数据库...");
        List<User> query = jdbcOperations.query(SELECT_USER_BY_ID, new UserRowMapper(), username);
        return query.get(0);
    }


    private class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {

            return new User(rs.getString("username"), rs.getString("password"));
        }
    }
}
