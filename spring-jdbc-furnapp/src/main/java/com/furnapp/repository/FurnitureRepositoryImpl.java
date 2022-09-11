package com.furnapp.repository;

import com.furnapp.model.Category;
import com.furnapp.model.Furniture;
import com.furnapp.model.Style;
import com.furnapp.util.Queries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class FurnitureRepositoryImpl implements IFurnitureRepository{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void addFurniture(Furniture furniture) {
        Object[] furnitureArray = {

                furniture.getName(),furniture.getBrand(),furniture.getPrice(),
                furniture.getCategory().name(),furniture.getStyle().name(),furniture.getMaterial(),
                furniture.getRoomType(),furniture.isStorageAvailabe()
        };
        jdbcTemplate.update(Queries.INSERTQUERY,furnitureArray);
    }

    @Override
    public void deleteFurniture(int furnitureId) {
        jdbcTemplate.update(Queries.DELETEQUERY,furnitureId);
    }

    @Override
    public void updateFurniture(int furnitureId, double price) {
        jdbcTemplate.update(Queries.UPDATEQUERY,price,furnitureId);
    }

    @Override
    public List<Furniture> findByMaterial(String material)  {

        return jdbcTemplate.query(Queries.MATERIALQUERY,(rs, rowNum) -> {
            Furniture furniture = new Furniture();
            furniture.setFurnitureId(rs.getInt("furniture_id"));
            furniture.setBrand(rs.getString("brand"));
            furniture.setCategory(Category.valueOf(rs.getString("category")));
            furniture.setMaterial(rs.getString("material"));
            furniture.setName(rs.getString("name"));
            furniture.setPrice(rs.getDouble("price"));
            furniture.setRoomType(rs.getString("room_type"));
            furniture.setStorageAvailabe(rs.getBoolean("storage_available"));
            furniture.setStyle(Style.valueOf(rs.getString("style")));
            return furniture;
        },material);
    }

    @Override
    public List<Furniture> findByRoomType(String type)  {

        return jdbcTemplate.query(Queries.ROOMQUERY,(rs, rowNum) -> {
            Furniture furniture = new Furniture();
            furniture.setFurnitureId(rs.getInt("furniture_id"));
            furniture.setBrand(rs.getString("brand"));
            furniture.setCategory(Category.valueOf(rs.getString("category")));
            furniture.setMaterial(rs.getString("material"));
            furniture.setName(rs.getString("name"));
            furniture.setPrice(rs.getDouble("price"));
            furniture.setRoomType(rs.getString("room_type"));
            furniture.setStorageAvailabe(rs.getBoolean("storage_available"));
            furniture.setStyle(Style.valueOf(rs.getString("style")));
            return furniture;
        },type);
    }

    @Override
    public List<Furniture> findByCategory(String name)  {

        return jdbcTemplate.query(Queries.CATEGORYQUERY,(rs, rowNum) -> {
            Furniture furniture = new Furniture();
            furniture.setFurnitureId(rs.getInt("furniture_id"));
            furniture.setBrand(rs.getString("brand"));
            furniture.setCategory(Category.valueOf(rs.getString("category")));
            furniture.setMaterial(rs.getString("material"));
            furniture.setName(rs.getString("name"));
            furniture.setPrice(rs.getDouble("price"));
            furniture.setRoomType(rs.getString("room_type"));
            furniture.setStorageAvailabe(rs.getBoolean("storage_available"));
            furniture.setStyle(Style.valueOf(rs.getString("style")));
            return furniture;
        },name);
    }

    @Override
    public List<Furniture> findByPriceRange(double minPrice, double maxPrice)  {

        return jdbcTemplate.query(Queries.PRICEQUERY,(rs, rowNum) -> {
            Furniture furniture = new Furniture();
            furniture.setFurnitureId(rs.getInt("furniture_id"));
            furniture.setBrand(rs.getString("brand"));
            furniture.setCategory(Category.valueOf(rs.getString("category")));
            furniture.setMaterial(rs.getString("material"));
            furniture.setName(rs.getString("name"));
            furniture.setPrice(rs.getDouble("price"));
            furniture.setRoomType(rs.getString("room_type"));
            furniture.setStorageAvailabe(rs.getBoolean("storage_available"));
            furniture.setStyle(Style.valueOf(rs.getString("style")));
            return furniture;
        },minPrice,maxPrice);
    }

    @Override
    public List<Furniture> findByStyle(String style)  {
        return jdbcTemplate.query(Queries.STYLEQUERY,new FurnitureMapper(),style);
    }

    @Override
    public List<Furniture> findByBrand(String brand)  {

        return jdbcTemplate.query(Queries.BRANDQUERY,new FurnitureMapper(),brand);
    }

    @Override
    public Furniture findById(int furnitureId)  {

        return jdbcTemplate.queryForObject(Queries.IDQUERY,new FurnitureMapper(),furnitureId);
    }


}
