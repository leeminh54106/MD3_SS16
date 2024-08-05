package konta.bai4.service;

import konta.bai4.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    Book findById(int bookId);
    boolean add(Book book);
    boolean edit(Book book);
    boolean delete(int bookId);
    List<Book> findByName(String bookName);
}
