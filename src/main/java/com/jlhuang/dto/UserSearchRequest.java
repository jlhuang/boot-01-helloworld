package com.jlhuang.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class UserSearchRequest implements Serializable {
    private int id;
}
