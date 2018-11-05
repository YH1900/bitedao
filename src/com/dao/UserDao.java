package com.dao;

import com.pojo.User;

public interface UserDao {
    public User findeUserById(int id) throws Exception;

    public void indertUser(User user) throws Exception;

    public void deleteUser(int id) throws Exception;
}
