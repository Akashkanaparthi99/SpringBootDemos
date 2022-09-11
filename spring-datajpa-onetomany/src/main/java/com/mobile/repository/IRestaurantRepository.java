package com.mobile.repository;

import com.mobile.model.Category;
import com.mobile.model.Cuisine;
import com.mobile.model.Restaurant;
import com.mobile.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IRestaurantRepository extends JpaRepository<Restaurant,Integer>{

    List<Restaurant> findByCity(String city);
    List<Restaurant> findByType(Type type);
    List<Restaurant> findByRating(double rating);
    
    @Query("from Restaurant r inner join r.items i where i.itemName = ?1")
    List<Restaurant> findByItemName(String itemName);
    @Query("from Restaurant r inner join r.items i where i.itemName = ?1 and i.category = ?2")
    List<Restaurant> findByItemNameCategory(String itemName, Category category);
    @Query("from Restaurant r inner join r.items i where i.cuisineType = ?1")
    List<Restaurant> findByCuisine(Cuisine cuisine);
    @Query("from Restaurant r inner join r.items i where i.category = ?1")
    List<Restaurant> findByCategory(String category);
    @Query("from Restaurant r inner join r.items i where i.cuisineType = ?1 and i.type = ?2")
    List<Restaurant> findByCuisineAndType(Cuisine cuisine, Type type);
    @Query("from Restaurant r inner join r.items i where i.itemName = ?1 and i.price <= ?2")
    List<Restaurant> findByItemNameLessPrice(String itemName, double price);
}
