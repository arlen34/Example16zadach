package com.company.dao;

import com.company.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private List<User> userDao = new ArrayList<>();

    public UserDao() {
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "userList=" + userDao +
                '}';
    }
}
