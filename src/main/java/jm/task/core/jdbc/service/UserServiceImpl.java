package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserServiceImpl extends UserDaoJDBCImpl implements UserService {


    public void createUsersTable() {
        super.createUsersTable();


    }

    public void dropUsersTable() {
        super.dropUsersTable();


    }

    public void saveUser(String name, String lastName, byte age) {
        super.saveUser(name, lastName, age);
        System.out.printf("User с именем – %s добавлен в базу данных\n", name);

    }

    public void removeUserById(long id) {
        super.removeUserById(id);

    }

    public List<User> getAllUsers() {
        return super.getAllUsers();
    }

    public void cleanUsersTable() {
        super.cleanUsersTable();
    }
}
