package ru.bootwebapp.PP_3_1_2_BOOTCRUD.service;


import ru.bootwebapp.PP_3_1_2_BOOTCRUD.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteUser(int id);

    List<User> getAllUsers();

    User getUserById(int id);
}
