package ru.pivovarov.KataSpringBoot_312.service;

import ru.pivovarov.KataSpringBoot_312.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();
    User saveUser(User user);
    User updateUser(User user);
    void deleteUserById(Long id);
}
