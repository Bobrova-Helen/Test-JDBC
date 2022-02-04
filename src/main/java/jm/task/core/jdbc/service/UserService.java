package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;

import java.util.List;

public interface UserService {
    void createUsersTable();

    void dropUsersTable();

    void removeUserById(int id);

    List<User> getAllUsers();

    void cleanUsersTable();

    void saveUser(String name, String lastName, byte age);

}
