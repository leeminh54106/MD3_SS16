package konta.bai4.dao;

import konta.bai4.model.Book;

import java.util.List;

public interface BookDAO {
    List<Book> findAll();
    Book findById(int bookId);
    boolean add(Book book);
    boolean edit(Book book);
    boolean delete(int bookId);
    List<Book> findByName(String bookName);
}
