package konta.bai4.service;

import konta.bai4.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Category findById(int cateId);
    boolean add(Category category);
    boolean edit(Category category);
    boolean delete(int cateId);
    List<Category> findByName(String cateName);
}
