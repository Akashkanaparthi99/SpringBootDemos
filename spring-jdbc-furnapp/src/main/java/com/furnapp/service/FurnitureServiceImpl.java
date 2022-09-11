package com.furnapp.service;

import com.furnapp.exceptions.FurnitureNotFoundException;
import com.furnapp.model.Furniture;
import com.furnapp.repository.IFurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FurnitureServiceImpl implements IFurnitureService{
    private IFurnitureRepository furnitureRepository;
    @Autowired
    public void setFurnitureRepository(IFurnitureRepository furnitureRepository) {
        this.furnitureRepository = furnitureRepository;
    }

    @Override
    public void addFurniture(Furniture furniture) {
    furnitureRepository.addFurniture(furniture);
    }

    @Override
    public void deleteFurniture(int furnitureId) {
        furnitureRepository.deleteFurniture(furnitureId);
    }

    @Override
    public void updateFurniture(int furnitureId, double price) {
        furnitureRepository.updateFurniture(furnitureId, price);
    }

    @Override
    public List<Furniture> getByMaterial(String material) throws FurnitureNotFoundException {
        return furnitureRepository.findByMaterial(material);
    }

    @Override
    public List<Furniture> getByRoomType(String type) throws FurnitureNotFoundException {
        return furnitureRepository.findByRoomType(type);
    }

    @Override
    public List<Furniture> getByCategory(String name) throws FurnitureNotFoundException {
        return furnitureRepository.findByCategory(name);
    }

    @Override
    public List<Furniture> getByPriceRange(double minPrice, double maxPrice) throws FurnitureNotFoundException {
        return furnitureRepository.findByPriceRange(minPrice, maxPrice);
    }

    @Override
    public List<Furniture> getByStyle(String style) throws FurnitureNotFoundException {
        return furnitureRepository.findByStyle(style);
    }

    @Override
    public List<Furniture> getByBrand(String brand) throws FurnitureNotFoundException {
        return furnitureRepository.findByBrand(brand);
    }

    @Override
    public Furniture getById(int furnitureId) throws FurnitureNotFoundException {
        return furnitureRepository.findById(furnitureId);
    }


}
