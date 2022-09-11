package com.courseapp.service;

import com.courseapp.model.Trainer;

import java.time.LocalDate;
import java.util.List;

public interface ITrainerService {
    void addTrainer(Trainer trainer);
    void updateTrainer(Trainer trainer);
    void deleteTrainer(int TrainerId);
    Trainer getById(int TrainerId);
    List<Trainer> getAll();


    List<Trainer> getByTrainerName(String trainerName); // all trainers with the trainer name containing
    List<Trainer> getByCourseName(String courseName); // all trainers for a course name containing java
    Trainer getTrainerDetails(String trainerName); // all course by this trainer
    List<Trainer> getByTechStack(String techstack );
    List<Trainer> getByCategoryRatings(String category,double ratings );
    List<Trainer> getByTrainerExperience(String category,int experience  );
    List<Trainer> getByCourseNamePrice(String courseName, double fees  );
    List<Trainer> getByNameDuration(String courseName, int duration); // all course having java
    List<Trainer> getByJoiningBetween(LocalDate beforeDate);
}
