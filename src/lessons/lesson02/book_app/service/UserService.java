package lessons.lesson02.book_app.service;

import lessons.lesson02.book_app.domain.Role;
import lessons.lesson02.book_app.domain.User;
import lessons.lesson02.book_app.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService() {
        userRepository = new UserRepository();
    }

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public void getAllUsers() {
        userRepository.getAllUsers();
    }

    public void getUserById(int id) {
        userRepository.getUserById(id);
    }

    public void getUserByEmail(String email) {
        userRepository.getUserByEmail(email);
    }

    public void getUsersByName(String name) {
        userRepository.getUsersByName(name);
    }

    public void getUsersByAge(int age) {
        userRepository.getUsersByAge(age);
    }

    public void getUsersByRole(Role role) {
        userRepository.getUsersByRole(role);
    }

    public void updateUserById(int id) {
        userRepository.updateUserById(id);
    }

    public void removeUserById(int id) {
        userRepository.removeUserById(id);
    }
}
