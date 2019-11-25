package com.chillax.dto;

/**
 * @ClassName:User
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/11/25 0025 14:03
 **/

public class User {
    private Integer id;

    private String name;

    private String password;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
