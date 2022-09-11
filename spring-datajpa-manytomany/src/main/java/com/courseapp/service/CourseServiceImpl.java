package com.courseapp.service;

import com.courseapp.model.Course;
import com.courseapp.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements ICourseService{
    private ICourseRepository courseRepository;
    @Autowired
    public void setCourseRepository(ICourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void addCourse(Course course) {
        courseRepository.save(course);
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
        return courseRepository.findAll(Sort.by("courseName"));
    }

    @Override
    public List<Course> getByCategory(String category) {
        return courseRepository.findByCategory(category);
    }

    @Override
    public List<Course> getByNameContaining(String name) {
        return courseRepository.findByCourseNameContaining("%"+name+"%");
    }

    @Override
    public List<Course> getByNameAndFees(String name, double fees) {
        return courseRepository.findByNameAndFees("%"+name+"%",fees);
    }

    @Override
    public List<Course> getByTrainer(String trainerName) {
        return courseRepository.findByTrainer("%"+trainerName+"%");
    }

    @Override
    public List<Course> getByTrainerExpertise(String trainerName, String techstack) {
        return courseRepository.findByTrainerExpertise("%"+trainerName+"%",techstack);
    }

    @Override
    public List<Course> getByTrainerRatings(String trainerName, double ratings) {
        return courseRepository.findByTrainerRatings("%"+trainerName+"%",ratings);
    }

    @Override
    public List<Course> getByTrainerExperience(String trainerName, int experience) {
        return courseRepository.findByTrainerExperience("%"+trainerName+"%",experience);
    }

    @Override
    public List<Course> getByTrainerCourseName(String trainerName, String courseName) {
        return courseRepository.findByTrainerCourseName("%"+trainerName+"%","%"+courseName+"%");
    }

    @Override
    public List<Course> getByNameAndDuration(String trainerName, int duration) {
        return courseRepository.findByNameAndDuration("%"+trainerName+"%",duration);
    }
}
