package konta.bai4.service.impl;

import konta.bai4.dao.impl.CategoryDAOImpl;
import konta.bai4.model.Category;
import konta.bai4.service.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Override
    public List<Category> findAll() {
        return new CategoryDAOImpl().findAll();
    }

    @Override
    public Category findById(int cateId) {
        return new CategoryDAOImpl().findById(cateId);
    }

    @Override
    public boolean add(Category category) {
        return new CategoryDAOImpl().add(category);
    }

    @Override
    public boolean edit(Category category) {
        return new CategoryDAOImpl().edit(category);
    }

    @Override
    public boolean delete(int cateId) {
        return new CategoryDAOImpl().delete(cateId);
    }

    @Override
    public List<Category> findByName(String cateName) {
        return new CategoryDAOImpl().findByName(cateName);
    }
}
