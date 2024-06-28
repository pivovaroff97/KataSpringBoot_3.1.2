package ru.pivovarov.KataSpringBoot_312.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pivovarov.KataSpringBoot_312.dao.UserDAO;
import ru.pivovarov.KataSpringBoot_312.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getUsers() {
        return userDAO.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userDAO.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userDAO.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userDAO.deleteById(id);
    }
}
