package com.chillax.dao;

import com.chillax.dto.User;

import java.util.List;
import java.util.Map;

/**
 * @ClassName:IUserDao
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/11/25 0025 14:02
 **/

public interface IUserDao {
    public User queryByPrimaryKey(Integer id);

    public List<User> getAllUser();

    public void insertUser(User user);

    public void insertUserByBatch(List<User> list);

    public void deleteByPrimaryKey(Integer id);

    public void delteUserByBatch(Map<String,Object> params);

    public void updateByPrimaryKey(User user);
}
