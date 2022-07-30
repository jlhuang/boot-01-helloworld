package com.jlhuang.mapper;

import com.jlhuang.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User queryUser(int userId);
    List<User> queryAllUser();
    void updateAllUser(List<User> list);
}
