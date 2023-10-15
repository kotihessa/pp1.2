package jm.task.core.jdbc;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
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

        userService.removeUserById(40);

        List<User> users = userService.getAllUsers();
        users.forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
