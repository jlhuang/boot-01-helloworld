package com.jlhuang.service;

import com.jlhuang.bean.User;
import com.jlhuang.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(int userId) {
        return userMapper.queryUser(userId);
    }
}
