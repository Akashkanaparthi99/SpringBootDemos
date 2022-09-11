package com.tutorapp.service;

import com.tutorapp.model.Category;
import com.tutorapp.model.Course;
import com.tutorapp.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements ICategoryService{

    ICategoryRepository categoryRepository;
    @Autowired
    public void setCategoryRepository(ICategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void updateCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(int categoryId) {
        categoryRepository.deleteById(categoryId);
    }

    @Override
    public Category getById(int categoryId) {
        return categoryRepository.findById(categoryId).get();
    }

//    @Override
//    public List<Category> getByTopic(String category) {
//        return null;
//    }
//
//    @Override
//    public List<Category> getByLanguage(String language) {
//        return null;
//    }
}
