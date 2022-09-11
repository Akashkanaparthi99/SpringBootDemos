package com.courseapp.service;

import com.courseapp.model.Trainer;
import com.courseapp.repository.ITrainerRepositry;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TrainerServiceImpl implements ITrainerService{

    ITrainerRepositry trainerRepositry;

    public TrainerServiceImpl(ITrainerRepositry trainerRepositry) {
        this.trainerRepositry = trainerRepositry;
    }

    @Override
    public void addTrainer(Trainer trainer) {
        trainerRepositry.save(trainer);
    }

    @Override
    public void updateTrainer(Trainer trainer) {
        trainerRepositry.save(trainer);
    }

    @Override
    public void deleteTrainer(int trainerId) {
        trainerRepositry.deleteById(trainerId);
    }

    @Override
    public Trainer getById(int trainerId) {
        return trainerRepositry.findById(trainerId).get();
    }

    @Override
    public List<Trainer> getAll() {
        return trainerRepositry.findAll(Sort.by("trainerName"));
    }

    @Override
    public List<Trainer> getByTrainerName(String trainerName) {
        return trainerRepositry.findByTrainerNameContaining(trainerName);
    }

    @Override
    public List<Trainer> getByCourseName(String courseName) {
        return trainerRepositry.findByCourseName(courseName);
    }

    @Override
    public Trainer getTrainerDetails(String trainerName) {
        return trainerRepositry.findByTrainerDetails(trainerName);
    }

    @Override
    public List<Trainer> getByTechStack(String techstack) {
        return trainerRepositry.findByTechStack(techstack);
    }

    @Override
    public List<Trainer> getByCategoryRatings(String category, double ratings) {
        return trainerRepositry.findByCategoryRatings(category,ratings);
    }

    @Override
    public List<Trainer> getByTrainerExperience(String category, int experience) {
        return trainerRepositry.findByTrainerExperience(category, experience);
    }

    @Override
    public List<Trainer> getByCourseNamePrice(String courseName, double fees) {
        return trainerRepositry.findByCourseNamePrice(courseName, fees);
    }

    @Override
    public List<Trainer> getByNameDuration(String courseName, int duration) {
        return trainerRepositry.findByNameDuration(courseName, duration);
    }

    @Override
    public List<Trainer> getByJoiningBetween(LocalDate beforeDate) {
        return trainerRepositry.findByJoiningDateBefore(beforeDate);
    }
}
