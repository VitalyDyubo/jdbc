package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    private Connection connection;

    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
        String sql = "CREATE TABLE IF NOT EXISTS users (Id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT, Name VARCHAR(20), LastName VARCHAR(20), Age TINYINT)";
<<<<<<< HEAD
        try {
            connection = Util.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            connection.close();
        } catch (SQLException e) {
            try {
                connection.close();
            } catch (SQLException ignore) {
            }
            System.out.println("Не удалось создать таблицу");
=======

        try (Connection connection = Util.getConnection()) {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Не удалось создать таблицу");;
>>>>>>> origin/main
        }
    }

    public void dropUsersTable() {
<<<<<<< HEAD
        try {
            connection = Util.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("DROP TABLE IF EXISTS Users");
            connection.close();
        } catch (SQLException e) {
            try {
                connection.close();
            } catch (SQLException ignore) {
            }
            System.out.println("Не удалось удалить таблицу");
=======
        try (Connection connection = Util.getConnection()) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("DROP TABLE IF EXISTS Users");
        } catch (SQLException e) {
            System.out.println("Не удалось удалить таблицу");;
>>>>>>> origin/main
        }
    }

    public void saveUser(String name, String lastName, byte age) {
        String sql = "INSERT Users (name, lastname, age) VALUE ('" + name + "', '" + lastName + "', " + age + ")";
<<<<<<< HEAD
        try {
            connection = Util.getConnection();
=======
        try (Connection connection = Util.getConnection()) {
>>>>>>> origin/main
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            connection.commit();
<<<<<<< HEAD
            connection.close();
        } catch (SQLException e) {
            try {
                connection.rollback();
                connection.close();
            } catch (SQLException ignore) {
            }
            System.out.println("Не удалось добавить пользователя");
=======
        } catch (SQLException e) {
            System.out.println("Не удалось добавить пользователя");;
>>>>>>> origin/main
        }

    }

    public void removeUserById(long id) {
<<<<<<< HEAD
        try {
            connection = Util.getConnection();
=======
        try (Connection connection = Util.getConnection()) {
>>>>>>> origin/main
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM Users WHERE Id = " + id);
            connection.commit();
<<<<<<< HEAD
            connection.close();
        } catch (SQLException e) {
            try {
                connection.rollback();
                connection.close();
            } catch (SQLException ignore) {
            }
            System.out.println("Не удалось удалить пользователя");

=======

        } catch (SQLException e) {
            System.out.println("Не удалось удалить пользователя");;
>>>>>>> origin/main
        }

    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
<<<<<<< HEAD
        try {
            connection = Util.getConnection();
=======
        try (Connection connection = Util.getConnection()) {
>>>>>>> origin/main
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Users");
            while (resultSet.next()) {
                users.add(new User(resultSet.getString(2), resultSet.getString(3), resultSet.getByte(4)));
            }
            connection.commit();
            connection.close();
        } catch (SQLException e) {
<<<<<<< HEAD
            try {
                connection.rollback();
                connection.close();
            } catch (SQLException ignore) {
            }
            System.out.println("Не удалось получить список пользователей");

=======
            System.out.println("Не удалось получить список пользователей");;
>>>>>>> origin/main
        }
        return users;
    }

    public void cleanUsersTable() {
<<<<<<< HEAD
        try {
            connection = Util.getConnection();
=======
        try (Connection connection = Util.getConnection()) {
>>>>>>> origin/main
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.executeUpdate("TRUNCATE Users");
            connection.commit();
<<<<<<< HEAD
            connection.close();
        } catch (SQLException e) {
            try {
                connection.rollback();
                connection.close();
            } catch (SQLException ignore) {
            }
            System.out.println("Не удалось очистить таблицу");
=======
        } catch (SQLException e) {
            System.out.println("Не удалось очистить таблицу");;
        }
>>>>>>> origin/main

        }
    }
}
