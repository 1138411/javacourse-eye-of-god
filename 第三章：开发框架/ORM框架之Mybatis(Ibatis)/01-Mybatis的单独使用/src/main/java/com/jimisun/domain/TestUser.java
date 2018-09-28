package com.jimisun.domain;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 08:35 2018-09-24
 * @Modified By:
 */
public class TestUser {

    private Integer id;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
