package com.jlhuang.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class User {

    private int userid;
    private String name;
    private String password;

    public User() {}

}
