package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alex", "Fix", (byte) 33);
        userService.saveUser("Alex", "Fix", (byte) 34);
        userService.saveUser("Alex", "Fix", (byte) 35);
        userService.saveUser("Alex", "Fix", (byte) 36);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
