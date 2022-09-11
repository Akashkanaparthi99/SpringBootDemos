package com.tutorapp.repository;

import com.tutorapp.model.Course;
import com.tutorapp.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ITrainerRepository extends JpaRepository<Trainer,Integer> {

//    List<Trainer> getByTopic(String topic);
//    List<Trainer> getByCourseNameContaining(String courseName);
//    List<Trainer> getByTechStackRatings(String techstack, double ratings);
//
//    List<Trainer> getBySubCategoryTopic(String subcategory, String topic);
//    List<Trainer> getBySubCategoryLevel(String subcategory, String level);
//
//    List<Trainer> getByLanguage(String language);
//    List<Trainer> getByTopicFeatures(String topic, String features);
//    List<Trainer> getByTopicLevel(String topic, String level);


}
