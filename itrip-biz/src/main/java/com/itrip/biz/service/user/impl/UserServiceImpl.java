package com.itrip.biz.service.user.impl;

import com.itrip.beans.pojo.User;
import com.itrip.biz.service.user.UserService;
import com.itrip.dao.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public User login(String userCode, String password) {
        User user = userMapper.getUserByUserCode(userCode);
        if (user!=null&&user.getUserPassword().equals(password)){
            return user;
        }
        return null;

    }
}
