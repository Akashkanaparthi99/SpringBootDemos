package com.tutorapp.service;

import com.tutorapp.model.Course;
import com.tutorapp.repository.ICourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements ICourseService{

    ICourseRepository courseRepository;

    public CourseServiceImpl(ICourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void deleteCourse(int courseId) {
        courseRepository.deleteById(courseId);
    }

    @Override
    public Course getById(int courseId) {
        return courseRepository.findById(courseId).get();
    }

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

//    @Override
//    public List<Course> getByCategory(String category) {
//        return null;
//    }
//
//    @Override
//    public List<Course> getByCategoryLevel(String category, String level) {
//        return null;
//    }
//
//    @Override
//    public List<Course> getByCategorySub(String category, String subcategory) {
//        return null;
//    }
//
//    @Override
//    public List<Course> getBySubCategory(String subcategory) {
//        return null;
//    }
//
//    @Override
//    public List<Course> getBySubCategoryTopic(String subcategory, String topic) {
//        return null;
//    }
//
//    @Override
//    public List<Course> getBySubCategoryLevel(String subcategory, String level) {
//        return null;
//    }
//
//    @Override
//    public List<Course> getByLanguage(String language) {
//        return null;
//    }
//
//    @Override
//    public List<Course> getByLanguageRatings(String language, double ratings) {
//        return null;
//    }
//
//    @Override
//    public List<Course> getByTopic(String topic) {
//        return null;
//    }
//
//    @Override
//    public List<Course> getByTopicFeatures(String topic, String features) {
//        return null;
//    }
//
//    @Override
//    public List<Course> getByTopicLevel(String topic, String level) {
//        return null;
//    }
//
//    @Override
//    public List<Course> getByTrainer(String trainerName) {
//        return null;
//    }
}
