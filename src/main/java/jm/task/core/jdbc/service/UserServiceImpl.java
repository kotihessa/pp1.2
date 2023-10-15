package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDaoHibernateImpl update = new UserDaoHibernateImpl();

    public void createUsersTable() {

        update.createUsersTable();
    }

    public void dropUsersTable() {

        update.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) {

        update.saveUser(name, lastName, age);

    }

    public void removeUserById(long id) {

        update.removeUserById(id);

    }

    public List<User> getAllUsers() {

        return update.getAllUsers();
    }

    public void cleanUsersTable() {

        update.cleanUsersTable();

    }
}
