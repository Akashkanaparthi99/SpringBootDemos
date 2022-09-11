package com.tutorapp.controller;

import com.tutorapp.model.Course;
import com.tutorapp.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author - Akash
 * @date - 10-06-2022
 * @project - springbootdemos
 */
@RestController
@RequestMapping("/course-api")
public class CourseController {
    private ICourseService courseService;
    @Autowired
    public void setCourseService(ICourseService courseService) {
        this.courseService = courseService;
    }

    ResponseEntity<Void> addCourse(Course course){

        return ResponseEntity.status(HttpStatus.OK).build();
    }
    void updateCourse(Course course);
    void deleteCourse(int courseId);
    Course getById(int courseId);
    List<Course> getAll();
}
