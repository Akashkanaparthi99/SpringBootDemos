package com.mobile.service;

import com.mobile.model.Category;
import com.mobile.model.Cuisine;
import com.mobile.model.Restaurant;
import com.mobile.model.Type;

import java.util.List;

public interface IRestaurantService {

    Restaurant addRestaurant(Restaurant restaurant);
    void updateRestaurant(Restaurant restaurant);
    void deleteRestaurant(int resId);
    Restaurant getById(int restId);
    List<Restaurant> getAll();

//    // derived queries
    List<Restaurant> getByCity(String city);
    List<Restaurant> getByType(Type type);
    List<Restaurant> getByRating(double rating);


//    // custom queries
    List<Restaurant> getByItemName(String itemName);
    List<Restaurant> getByItemNameCategory(String itemName, Category category);
    List<Restaurant> getByCuisine(Cuisine cuisine);
    List<Restaurant> getByCategory(String category);
    List<Restaurant> getByCuisineAndType(Cuisine cuisine, Type type);
    List<Restaurant> getByItemNameLessPrice(String itemName, double price);
}
