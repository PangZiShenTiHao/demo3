package com.chillax.service.Impl;

import com.chillax.dao.IUserDao;
import com.chillax.dto.User;
import com.chillax.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName:UserServiceImpl
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/11/25 0025 14:05
 **/

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User getUserById(int userId) {
        return userDao.queryByPrimaryKey(userId);
    }

    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    public void addUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

}
