package com.chillax.service;

import com.chillax.dto.User;

import java.util.List;

/**
 * @ClassName:IUserService
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/11/25 0025 14:05
 **/

public interface IUserService {
    public User getUserById(int userId);

    public void insertUser(User user);

    public void addUser(User user);

    public List<User> getAllUser();
}
