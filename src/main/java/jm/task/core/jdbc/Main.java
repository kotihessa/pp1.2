package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь


        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Катя", "Садовьякова", (byte) 23);
        userService.saveUser("Мацкель", "Вадим", (byte) 27);
        userService.saveUser("Валерий", "Охтень", (byte) 19);
        userService.saveUser("Винсент", "Котофеевич", (byte) 3);

        List<User> users = userService.getAllUsers();
        users.forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
