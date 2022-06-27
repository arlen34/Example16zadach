package com.company.service;

import com.company.model.User;

import java.util.List;

/**UserServiceтин ичинде 4 метод болот, userди кошуу, id менен табуу, id менен очуруу жана баардык userлерди алуу.*/
public interface UserService {
    void addUser(List<User> users);
    void findById(List<User> users);
    void deleteById(List<User> users);
    void getUsers(List<User> users);
}
