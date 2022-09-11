package com.tutorapp.service;

import com.tutorapp.model.Category;
import com.tutorapp.model.Trainer;

import java.util.List;

public interface ICategoryService {


    Category addCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(int categoryId);
    Category getById(int categoryId);
    
//    List<Category> getByTopic(String category);
//    List<Category> getByLanguage(String language);
   

}
