package com.furnapp.service;

import com.furnapp.exceptions.FurnitureNotFoundException;
import com.furnapp.model.Furniture;

import java.util.List;

public interface IFurnitureService {
    void addFurniture(Furniture furniture);
    void deleteFurniture(int furnitureId);
    void updateFurniture(int furnitureId , double price);

    List<Furniture> getByMaterial(String material) throws FurnitureNotFoundException;
    List<Furniture> getByRoomType(String type) throws FurnitureNotFoundException;
    List<Furniture> getByCategory(String name) throws FurnitureNotFoundException;
    List<Furniture> getByPriceRange(double minPrice,double maxPrice) throws FurnitureNotFoundException;
    List<Furniture> getByStyle(String style) throws FurnitureNotFoundException;
    List<Furniture> getByBrand(String brand) throws FurnitureNotFoundException;
    Furniture getById(int furnitureId) throws FurnitureNotFoundException;
}
