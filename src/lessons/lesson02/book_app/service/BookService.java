package lessons.lesson02.book_app.service;

import lessons.lesson02.book_app.domain.Book;
import lessons.lesson02.book_app.repository.BookRepository;

public class BookService {
    private final BookRepository bookRepository;

    public BookService() {
        bookRepository = new BookRepository();
    }

    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public void getBookById(int id) {
        bookRepository.getBookById(id);
    }

    public void getAllBooks() {
        bookRepository.getAllBooks();
    }

    public void getBooksByTitle(String title) {
        bookRepository.getBooksByTitle(title);
    }

    public void getBooksByAuthor(String author) {
        bookRepository.getBooksByAuthor(author);
    }

    public void updateBookById(int id) {
        bookRepository.updateBookById(id);
    }

    public void removeBookById(int id) {
        bookRepository.removeBookById(id);
    }
}
