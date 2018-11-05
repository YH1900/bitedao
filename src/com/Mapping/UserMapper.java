package com.Mapping;

import com.pojo.User;

public interface UserMapper {
    public User findeUserById(int id) throws Exception;
}
