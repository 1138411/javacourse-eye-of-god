package com.jimisun.spring.example8;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 11:13 2018-09-27
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.execute("select * from user");
    }
}
