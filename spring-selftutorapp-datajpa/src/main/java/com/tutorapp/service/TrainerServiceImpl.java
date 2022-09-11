package com.tutorapp.service;

import com.tutorapp.model.Trainer;
import com.tutorapp.repository.ITrainerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrainerServiceImpl implements ITrainerService{

   ITrainerRepository trainerRepository;

    public TrainerServiceImpl(ITrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public Trainer addTrainer(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    @Override
    public void updateTrainer(Trainer trainer) {
        trainerRepository.save(trainer);
    }

    @Override
    public void deleteTrainer(int trainerId) {
        trainerRepository.deleteById(trainerId);
    }

    @Override
    public Trainer getById(int trainerId) {
        return trainerRepository.findById(trainerId).get();
    }

    @Override
    public List<Trainer> getAll() {
        return trainerRepository.findAll();
    }


//    @Override
//    public List<Trainer> getByTopic(String topic) {
//        return null;
//    }
//
//    @Override
//    public List<Trainer> getByCourseNameContaining(String courseName) {
//        return null;
//    }
//
//    @Override
//    public List<Trainer> getByTechStackRatings(String techstack, double ratings) {
//        return null;
//    }
//
//    @Override
//    public List<Trainer> getBySubCategoryTopic(String subcategory, String topic) {
//        return null;
//    }
//
//    @Override
//    public List<Trainer> getBySubCategoryLevel(String subcategory, String level) {
//        return null;
//    }
//
//    @Override
//    public List<Trainer> getByLanguage(String language) {
//        return null;
//    }
//
//    @Override
//    public List<Trainer> getByTopicFeatures(String topic, String features) {
//        return null;
//    }
//
//    @Override
//    public List<Trainer> getByTopicLevel(String topic, String level) {
//        return null;
//    }
}
