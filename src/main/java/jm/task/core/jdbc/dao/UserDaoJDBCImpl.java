//package jm.task.core.jdbc.dao;
//
//import jm.task.core.jdbc.model.User;
//import jm.task.core.jdbc.util.Util;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//import static jm.task.core.jdbc.util.Util.getConnection;
//
//public class UserDaoJDBCImpl implements UserDao {
//    public UserDaoJDBCImpl() {
//
//    }
//
//    public void createUsersTable() {
//
//        String query = "CREATE TABLE IF NOT EXISTS users (" +
//                "id SERIAL PRIMARY KEY," +
//                "name VARCHAR(255) NOT NULL," +
//                "LastName VARCHAR(255) NOT NULL," +
//                "age INT NOT NULL" +
//                ")";
//
//        // закрыты, чтобы не было утечек
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement()){
//            statement.execute(query);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void dropUsersTable() {
//        String query = "DROP TABLE IF EXISTS users";
//
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement()){
//            statement.execute(query);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    public void saveUser(String name, String lastname, byte age) {
//        String query = "INSERT INTO users (name, lastname, age)"
//                + " VALUES (?, ?, ?)";
//
//        try (PreparedStatement statement = Util.getConnection().prepareStatement(query)){
//            statement.setString(1, name);
//            statement.setString(2, lastname);
//            statement.setByte(3, age);
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void removeUserById(long id) {
//        String query = "DELETE FROM users WHERE id = ?";
//
//        try (PreparedStatement statement = Util.getConnection().prepareStatement(query)){
//            statement.setLong(1, id);
//            statement.executeUpdate(query);
//        } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//
//
//    }
//
//    public List<User> getAllUsers() {
//        String query = "SELECT * FROM users";
//        List<User> users = new ArrayList<>();
//
//        try (Statement statement = Util.getConnection().createStatement()){
//            ResultSet resultSet = statement.executeQuery(query);
//
//            // информация, возвращаемая из таблицы
//            while (resultSet.next()) {
//                users.add(new User(
//                        resultSet.getLong("id"),
//                        resultSet.getString("name"),
//                        resultSet.getString("lastname"), //надо писать с маленькой буквы
//                        resultSet.getByte("age")
//                ));
//            }
//            return users;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }
//
//    public void cleanUsersTable() {
//        String query = "TRUNCATE TABLE users";
//
//        try (Connection connection = Util.getConnection();
//             Statement statement = connection.createStatement()){
//            statement.execute(query);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//}
//
//}
