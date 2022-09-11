package com.mobile.service;

import com.mobile.model.Category;
import com.mobile.model.Cuisine;
import com.mobile.model.Restaurant;
import com.mobile.model.Type;
import com.mobile.repository.IRestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements IRestaurantService{
    private IRestaurantRepository repository;
    @Autowired
    public void setRepository(IRestaurantRepository repository) {
        this.repository = repository;
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return repository.save(restaurant);
    }

    @Override
    public void updateRestaurant(Restaurant restaurant) {
        repository.save(restaurant);
    }

    @Override
    public void deleteRestaurant(int resId) {
        repository.deleteById(resId);
    }

    @Override
    public Restaurant getById(int restId) {
        return repository.findById(restId).get();
    }

    @Override
    public List<Restaurant> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Restaurant> getByCity(String city) {
        return repository.findByCity(city);
    }

    @Override
    public List<Restaurant> getByType(Type type) {
        return repository.findByType(type);
    }

    @Override
    public List<Restaurant> getByRating(double rating) {
        return repository.findByRating(rating);
    }

    @Override
    public List<Restaurant> getByItemName(String itemName) {
        return repository.findByItemName(itemName);
    }

    @Override
    public List<Restaurant> getByItemNameCategory(String itemName, Category category) {
        return repository.findByItemNameCategory(itemName, category);
    }

    @Override
    public List<Restaurant> getByCuisine(Cuisine cuisine) {
        return repository.findByCuisine(cuisine);
    }

    @Override
    public List<Restaurant> getByCategory(String category) {
        return repository.findByCategory(category);
    }

    @Override
    public List<Restaurant> getByCuisineAndType(Cuisine cuisine, Type type) {
        return repository.findByCuisineAndType(cuisine, type);
    }

    @Override
    public List<Restaurant> getByItemNameLessPrice(String itemName, double price) {
        return repository.findByItemNameLessPrice(itemName, price);
    }


}
