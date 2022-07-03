package com.jlhuang.mapper;

import com.jlhuang.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User queryUser(int userId);
}
