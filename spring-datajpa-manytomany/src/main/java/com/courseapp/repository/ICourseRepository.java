package com.courseapp.repository;

import com.courseapp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICourseRepository extends JpaRepository<Course,Integer> {

    List<Course> findByCategory(String category);
    
    List<Course> findByCourseNameContaining(String name);
    @Query("from Course c where c.courseName like ?1 and c.fees < ?2")
    List<Course> findByNameAndFees(String name,double fees);
    @Query("from Course c inner join c.trainers t where t.trainerName like ?1")
    List<Course> findByTrainer(String trainerName);
    @Query("from Course c inner join c.trainers t where t.trainerName like ?1 and t.techStack = ?2")
    List<Course> findByTrainerExpertise(String trainerName,String techstack);
    @Query("from Course c inner join c.trainers t where t.trainerName like ?1 and t.rating <= ?2")
    List<Course> findByTrainerRatings(String trainerName,double ratings);
    @Query("from Course c inner join c.trainers t where t.trainerName like ?1 and t.experience = ?2")
    List<Course> findByTrainerExperience(String trainerName,int experience);
    @Query("from Course c inner join c.trainers t where t.trainerName like ?1 and c.courseName like ?2")
    List<Course> findByTrainerCourseName(String trainerName,String courseName);
    @Query("from Course c inner join c.trainers t where t.trainerName like ?1 and c.durationInDays <= ?2")
    List<Course> findByNameAndDuration(String trainerName,int duration);
}
