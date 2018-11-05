package com.UserMapper;

import com.pojo.User;

public interface UserDao {
    public User findeUserById(int id) throws Exception;
}
