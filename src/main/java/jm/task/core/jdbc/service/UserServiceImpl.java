package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private static UserDaoJDBCImpl usdao = new UserDaoJDBCImpl();

    public void createUsersTable() {

        usdao.createUsersTable();
    }

    public void dropUsersTable() {

        usdao.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) {

        usdao.saveUser(name, lastName, age);

    }

    public void removeUserById(long id) {

        usdao.removeUserById(id);

    }

    public List<User> getAllUsers() {

        return usdao.getAllUsers();
    }

    public void cleanUsersTable() {

        usdao.cleanUsersTable();

    }
}
