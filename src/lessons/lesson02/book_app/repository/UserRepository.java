package lessons.lesson02.book_app.repository;

import lessons.lesson02.book_app.domain.Role;
import lessons.lesson02.book_app.domain.User;

public class UserRepository {
    public void addUser(User user) {
        System.out.println("Пользователь добавлен");
    }

    public void getAllUsers() {
        System.out.println("Выведены все пользователи");
    }

    public void getUserById(int id) {
        System.out.println("Выведен пользователь по id");
    }

    public void getUserByEmail(String email) {
        System.out.println("Выведен пользователь по email");
    }

    public void getUsersByName(String name) {
        System.out.println("Выведены пользователи по имени");
    }

    public void getUsersByAge(int age) {
        System.out.println("Выведены пользователи по возрасту");
    }

    public void getUsersByRole(Role role) {
        System.out.println("Выведены пользователи по роле");
    }

    public void updateUserById(int id) {
        System.out.println("Пользователь изменен");
    }

    public void removeUserById(int id) {
        System.out.println("Пользователь удален");
    }
}
