package com.furnapp.repository;

import com.furnapp.exceptions.FurnitureNotFoundException;
import com.furnapp.model.Furniture;

import java.util.List;

public interface IFurnitureRepository {
    void addFurniture(Furniture furniture);
    void deleteFurniture(int furnitureId);
    void updateFurniture(int furnitureId , double price);

    List<Furniture> findByMaterial(String material);
    List<Furniture> findByRoomType(String type);
    List<Furniture> findByCategory(String name);
    List<Furniture> findByPriceRange(double minPrice,double maxPrice);
    List<Furniture> findByStyle(String style);
    List<Furniture> findByBrand(String brand);
    Furniture findById(int furnitureId);
}
