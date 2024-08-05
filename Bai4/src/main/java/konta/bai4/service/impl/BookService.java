package konta.bai4.service.impl;

import konta.bai4.dao.impl.BookDAOImpl;
import konta.bai4.model.Book;
import konta.bai4.service.IBookService;

import java.util.List;

public class BookService implements IBookService {
    @Override
    public List<Book> findAll() {
        return new BookDAOImpl().findAll();
    }

    @Override
    public Book findById(int bookId) {
        return new BookDAOImpl().findById(bookId);
    }

    @Override
    public boolean add(Book book) {
        return new BookDAOImpl().add(book);
    }

    @Override
    public boolean edit(Book book) {
        return new BookDAOImpl().edit(book);
    }

    @Override
    public boolean delete(int bookId) {
        return new BookDAOImpl().delete(bookId);
    }

    @Override
    public List<Book> findByName(String bookName) {
        return new BookDAOImpl().findByName(bookName);
    }
}
