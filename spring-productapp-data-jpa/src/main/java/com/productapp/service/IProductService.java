package com.productapp.service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Category;
import com.productapp.model.Product;

import java.time.LocalDate;
import java.util.List;

public interface IProductService {
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);
    List<Product> getAll();
    Product getById(int productId) throws ProductNotFoundException;
    List<Product> getByCategory(Category category) throws ProductNotFoundException;
    List<Product> getByBrand(String brand) throws ProductNotFoundException;
    List<Product> getByLesserPrice(double price) throws ProductNotFoundException;
    List<Product> getByBrandStarting(String brand) throws ProductNotFoundException;
    List<Product> getByExpiryDate(LocalDate expiryDate);

    // custom Query
    List<Product> getByNewBrands(String brand);
    List<Product> getByNewBrandshow(String brand,double cost);
    List<Product> getByCatExp(Category category,LocalDate expirydate);
    // named query
    List<Product> getByBrandExpiry(String brand,LocalDate expirydate);
    List<Product> getByCatBrand(Category category,String brand);
    List<Product> getByBrandName(String brand,String name);
    // native query
    List<Product> findByBetweenPrice(double minPrice,double maxPrice);
    // modifing NQ
    void updateProductCost(int productId, double price);

}
