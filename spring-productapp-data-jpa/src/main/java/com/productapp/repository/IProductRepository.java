package com.productapp.repository;

import com.productapp.model.Category;
import com.productapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product,Integer> {

    //derived queries can startwith findBy, readBy, getBy
    List<Product> findByCategory(Category category);
    List<Product> getByBrand(String brand);
    List<Product> getByBrandStartingWith(String brand);
    List<Product> readByPriceLessThan(double price);
    List<Product> findByExpiryDateLessThan(LocalDate date);

    // custom query - JPQL = java persistence query language
    // query should be writen in the terms of java
    @Query("from Product p where p.brand = ?1")
    List<Product> getByNewBrands(String brand);
    @Query("from Product p where p.brand = ?1 and price = ?2")
    List<Product> getByNewBrandshow(String brand,double cost);
    @Query("from Product p where p.category = ?1 and p.expiryDate < ?2")
    List<Product> findByCatExp(Category category,LocalDate expirydate);
    // Named Query
    @Query(name = "findByBrandExpiry")
    List<Product> getByBrandExpiry(String brand,LocalDate expirydate);
    @Query(name = "findByCatBrand")
    List<Product> findByCatBrand(Category category,String brand);
    @Query(name = "findByBrandName")
    List<Product> findByBrandName(String brand,String name);
    // Native Query
    @Query(value = "select * from newproduct where cost between ?1 and ?2" ,nativeQuery = true)
    List<Product> findByBetweenPrice(double minPrice,double maxPrice);
    // modifying inbulit query
    @Modifying
    @Query(value = "update newproduct set cost = ?2 where product_id =?1",nativeQuery = true)
    void updateProductCost(int productId, double price);


}
