package lessons.lesson02.book_app.controller;

import lessons.lesson02.book_app.domain.Book;
import lessons.lesson02.book_app.service.BookService;

public class BookController {
    private final BookService bookService;

    public BookController() {
        bookService = new BookService();
    }

    public void addBook(Book book) {
        bookService.addBook(book);
    }

    public void getBookById(int id) {
        bookService.getBookById(id);
    }

    public void getAllBooks() {
        bookService.getAllBooks();
    }

    public void getBooksByTitle(String title) {
        bookService.getBooksByTitle(title);
    }

    public void getBooksByAuthor(String author) {
        bookService.getBooksByAuthor(author);
    }

    public void updateBookById(int id) {
        bookService.updateBookById(id);
    }

    public void removeBookById(int id) {
        bookService.removeBookById(id);
    }
}
