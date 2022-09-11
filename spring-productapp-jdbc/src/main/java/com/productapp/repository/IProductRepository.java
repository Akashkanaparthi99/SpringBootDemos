package com.productapp.repository;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface IProductRepository {
    void addProduct(Product product);
    void updateProduct(int productId, double price);
    void deleteProduct(int productId);
    List<Product> findAll();
    Product findById(int productId) throws ProductNotFoundException;
    List<Product> findByCategory(String category) throws ProductNotFoundException;
    List<Product> findByBrand(String brand) throws ProductNotFoundException;
    List<Product> findByLesserPrice(double price) throws ProductNotFoundException;
    List<Product> findByBrandStarting(String brand) throws ProductNotFoundException;
    List<Product> findByExpiryDate(LocalDate expiryDate);
}
