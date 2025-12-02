package lessons.lesson02.book_app.repository;

import lessons.lesson02.book_app.domain.Book;

import java.io.File;

public class BookRepository {
    public void addBook(Book book) {
        System.out.println("Книга добавлена");
    }

    public void getAllBooks() {
        System.out.println("Выведены все книги");
    }

    public void getBookById(int id) {
        System.out.println("Выведена книга по id");
    }

    public void getBooksByTitle(String title) {
        System.out.println("Выведены книги по названию");
    }

    public void getBooksByAuthor(String author) {
        System.out.println("Выведены книги по автору");
    }

    public void updateBookById(int id) {
        System.out.println("Книга изменена");
    }

    public void removeBookById(int id) {
        System.out.println("Книга удалена");
    }
}
