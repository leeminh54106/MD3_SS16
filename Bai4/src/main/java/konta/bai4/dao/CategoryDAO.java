package konta.bai4.dao;

import konta.bai4.model.Category;

import java.util.List;

public interface CategoryDAO {
    List<Category> findAll();
    Category findById(int categoryId);
    boolean add(Category category);
    boolean edit(Category category);
    boolean delete(int categoryId);
    List<Category> findByName(String categoryName);
}
