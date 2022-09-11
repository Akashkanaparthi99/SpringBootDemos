package com.courseapp.repository;

import com.courseapp.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ITrainerRepositry extends JpaRepository<Trainer,Integer> {

    List<Trainer> findByTrainerNameContaining(String trainerName); // all trainers with the trainer name containing
    List<Trainer> findByTechStack(String techstack );
    @Query("from Trainer t inner join t.courses c where c.category =?1 and t.rating = ?2")
    List<Trainer> findByCategoryRatings(String category,double ratings );
    @Query("from Trainer t inner join t.courses c where c.courseName like ?1")
    List<Trainer> findByCourseName(String courseName); // all trainers for a course name containing java
    @Query("from Trainer t where t.trainerName like ?1")
    Trainer findByTrainerDetails(String trainerName); // all course by this trainer
    @Query("from Trainer t inner join t.courses c where c.category like ?1 and t.experience <=?2")
    List<Trainer> findByTrainerExperience(String category,int experience  );
    @Query("from Trainer t inner join t.courses c where c.courseName like ?1 and c.fees <= ?2")
    List<Trainer> findByCourseNamePrice(String courseName, double fees  );
    @Query("from Trainer t inner join t.courses c where c.courseName like ?1 and c.durationInDays <= ?2")
    List<Trainer> findByNameDuration(String courseName, int duration); // all course having java
    @Query("from Trainer t where t.joiningDate <= ?1")
    List<Trainer> findByJoiningDateBefore(LocalDate beforeDate);
}
