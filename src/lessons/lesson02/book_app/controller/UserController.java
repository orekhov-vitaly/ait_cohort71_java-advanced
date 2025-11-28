package lessons.lesson02.book_app.controller;

import lessons.lesson02.book_app.domain.Role;
import lessons.lesson02.book_app.domain.User;
import lessons.lesson02.book_app.service.UserService;

public class UserController {
    private final UserService userService;

    public UserController() {
        userService = new UserService();
    }

    public void addUser(User user) {
        userService.addUser(user);
    }

    public void getAllUsers() {
        userService.getAllUsers();
    }

    public void getUserById(int id) {
        userService.getUserById(id);
    }

    public void getUserByEmail(String email) {
        userService.getUserByEmail(email);
    }

    public void getUsersByName(String name) {
        userService.getUsersByName(name);
    }

    public void getUsersByAge(int age) {
        userService.getUsersByAge(age);
    }

    public void getUsersByRole(Role role) {
        userService.getUsersByRole(role);
    }

    public void updateUserById(int id) {
        userService.updateUserById(id);
    }

    public void removeUserById(int id) {
        userService.removeUserById(id);
    }
}
