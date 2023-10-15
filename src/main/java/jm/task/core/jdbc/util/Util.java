package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class Util {
    // реализуйте настройку соеденения с БД
    public static Session hibernateConnection() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5433/postgres");
        properties.setProperty("dialect", "org.hibernate.dialect.PostgreSQL95Dialect");
        properties.setProperty("hibernate.connection.username", "postgres");
        properties.setProperty("hibernate.connection.password", "postgres");
        properties.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        properties.setProperty("show_sql", String.valueOf(true));
        SessionFactory sessionFactory = new Configuration().addProperties(properties)
                .addAnnotatedClass(User.class).buildSessionFactory();
        return sessionFactory.openSession();
    }
}