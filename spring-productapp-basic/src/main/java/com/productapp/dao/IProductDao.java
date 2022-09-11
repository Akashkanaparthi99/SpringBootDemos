package com.productapp.dao;

import com.productapp.model.Product;

import java.util.List;

public interface IProductDao {
    List<Product> getAll();
    Product getById(int productId);
    List<Product> getByCategory(String category);
    List<Product> getByBrand(String brand);
}
