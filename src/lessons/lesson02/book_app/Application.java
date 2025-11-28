package lessons.lesson02.book_app;

import lessons.lesson02.book_app.controller.BookController;
import lessons.lesson02.book_app.controller.UserController;
import lessons.lesson02.book_app.domain.Book;
import lessons.lesson02.book_app.domain.Role;
import lessons.lesson02.book_app.domain.User;

public class Application {
    private static BookController bookController;
    private static UserController userController;

    public static void main(String[] args) {
        try {
            bookController = new BookController();
            userController = new UserController();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Create Books
        Book book1 = new Book(1, "Эффективное программирование на Java", "Дж. Блох", 2018);
        Book book2 = new Book(2, "Java. Полное руководство", "Герберт Шилдт", 2020);
        Book book3 = new Book(3, "Java. Библиотека профессионала. Том 1. Основы", "К. Хорстман", 2019);
        Book book4 = new Book(4, "Изучаем Java", "Кети Сьера", 2005);
        Book book5 = new Book(5, "Java. Многопоточность в практике", "Дж. Ритц", 2011);
        Book book6 = new Book(6, "Java. Руководство для начинающих", "Герберт Шилдт", 2019);

        bookController.addBook(book1);
        bookController.addBook(book2);
        bookController.addBook(book3);
        bookController.addBook(book4);
        bookController.addBook(book5);
        bookController.addBook(book6);

        bookController.getAllBooks();
        bookController.getBookById(3);
        bookController.getBooksByTitle("Java");
        bookController.getBooksByAuthor("Шилдт");
        bookController.updateBookById(4);
        bookController.removeBookById(6);

        // Create Users
        User user1 = new User(1, "John", 32, "Berlin", "john@email.com", Role.ADMIN);
        User user2 = new User(2, "Tom", 25, "Keoln", "tom@email.com", Role.LIBRARIAN);
        User user3 = new User(3, "Max", 46, "Mannheim", "max@email.com", Role.READER);

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);

        userController.getAllUsers();
        userController.getUserById(3);
        userController.getUserByEmail("john@email.com");
        userController.getUsersByName("Tom");
        userController.getUsersByAge(32);
        userController.getUsersByRole(Role.READER);
        userController.updateUserById(2);
        userController.removeUserById(3);
    }
}
