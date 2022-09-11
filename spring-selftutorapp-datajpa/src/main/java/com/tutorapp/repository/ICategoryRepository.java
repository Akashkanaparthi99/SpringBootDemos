package com.tutorapp.repository;

import com.tutorapp.model.Category;
import com.tutorapp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ICategoryRepository extends JpaRepository<Category,Integer> {
//
//    List<Category> getByTopic(String category);
//    List<Category> getByLanguage(String language);
}
