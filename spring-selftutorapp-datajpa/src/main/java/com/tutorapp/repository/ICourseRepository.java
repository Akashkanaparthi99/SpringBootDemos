package com.tutorapp.repository;

import com.tutorapp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ICourseRepository extends JpaRepository<Course,Integer> {

//    List<Course> getByCategory(String category);
//    List<Course> getByCategoryLevel(String category, String level);
//    List<Course> getByCategorySub(String category, String subcategory);
//    List<Course> getBySubCategory(String subcategory);
//    List<Course> getBySubCategoryTopic(String subcategory, String topic);
//    List<Course> getBySubCategoryLevel(String subcategory, String level);
//    List<Course> getByLanguage(String language);
//    List<Course> getByLanguageRatings(String language, double ratings);
//    List<Course> getByTopic(String topic);
//    List<Course> getByTopicFeatures(String topic, String features);
//    List<Course> getByTopicLevel(String topic, String level);
//    List<Course> getByTrainer(String trainerName);


}
