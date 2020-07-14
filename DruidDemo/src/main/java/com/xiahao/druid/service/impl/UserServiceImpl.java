package com.xiahao.druid.service.impl;

import com.xiahao.druid.mapper.UserMapper;
import com.xiahao.druid.model.User;
import com.xiahao.druid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiahao on 2020/7/14.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public User getUserById(int id){
       return userMapper.selectByPrimaryKey(id);
    }
}
