package com.jlhuang.dto;

import com.jlhuang.bean.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
public class UserListParam implements Serializable {

    private List<User> userList;

}
