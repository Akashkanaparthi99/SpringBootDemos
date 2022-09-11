package com.courseapp.service;

import com.courseapp.model.Course;

import java.util.List;

public interface ICourseService {

    void addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(int courseId);
    Course getById(int courseId);
    List<Course> getAll();
    List<Course> getByCategory(String category);
    List<Course> getByNameContaining(String name);
    List<Course> getByNameAndFees(String name,double fees);
    List<Course> getByTrainer(String trainerName);
    List<Course> getByTrainerExpertise(String trainerName,String techstack);
    List<Course> getByTrainerRatings(String trainerName,double ratings);
    List<Course> getByTrainerExperience(String trainerName,int experience);
    List<Course> getByTrainerCourseName(String trainerName,String courseName);
    List<Course> getByNameAndDuration(String trainerName,int duration);

}
