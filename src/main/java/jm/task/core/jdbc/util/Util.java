package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres",
                "postgres", "postgres");
    }

//    public Util() {
//    }
}

// создать Connection (skl) возвращает объект коннекшн, чтобы его переиспользовать, обработать исключения
// драйвер менеджер, метод — гет коннекшн (url, login, password), возвращает коннекшн
// сделать два метода для gdbs и хибера
/*В этом примере мы используем URL, USERNAME и PASSWORD для подключения к базе данных PostgreSQL.
Замените "db_name", "username" и "password" на соответствующие значения вашей базы данных.
Теперь у вас есть метод getConnection(), который возвращает объект Connection для соединения
с базой данных PostgreSQL. Вы можете использовать этот метод в других классах вашего проекта
для выполнения операций с базой данных.
Не забудьте также добавить необходимые зависимости в ваш проект,
включая JDBC драйвер для PostgreSQL.*/
//    public class Util {
//        private static final String URL = "jdbc:postgresql://localhost:5432/db_name";
//        private static final String USERNAME = "username";
//        private static final String PASSWORD = "password";
//
//        public static Connection getConnection() {
//            Connection connection;
//            try {
//                return connection;
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            return null;


