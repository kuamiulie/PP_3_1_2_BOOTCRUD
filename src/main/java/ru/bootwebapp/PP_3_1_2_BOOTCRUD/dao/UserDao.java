package ru.bootwebapp.PP_3_1_2_BOOTCRUD.dao;


import ru.bootwebapp.PP_3_1_2_BOOTCRUD.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void deleteUser(int id);

    List<User> getAllUsers();

    User getUserById(int id);
}
