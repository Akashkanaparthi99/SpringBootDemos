package com.productapp.service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Category;
import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    private IProductRepository productRepository;

    @Autowired
    public void setProductRepository(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(int productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(int productId) throws ProductNotFoundException {
        return productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException("Invalid Id"));
    }

    @Override
    public List<Product> getByCategory(Category category) throws ProductNotFoundException {
        return productRepository.findByCategory(category);
    }

    @Override
    public List<Product> getByBrand(String brand) throws ProductNotFoundException {
        return productRepository.getByBrand(brand);
    }

    @Override
    public List<Product> getByLesserPrice(double price) throws ProductNotFoundException {
        return productRepository.readByPriceLessThan(price);
    }

    @Override
    public List<Product> getByBrandStarting(String brand) throws ProductNotFoundException {
        return productRepository.getByBrandStartingWith(brand);
    }

    @Override
    public List<Product> getByExpiryDate(LocalDate expiryDate) {
        return productRepository.findByExpiryDateLessThan(expiryDate);
    }

    @Override
    public List<Product> getByCatExp(Category category, LocalDate expirydate) {
        return productRepository.findByCatExp(category, expirydate);
    }

    @Override
    public List<Product> getByBrandExpiry(String brand, LocalDate expirydate) {
        return productRepository.getByBrandExpiry(brand, expirydate);
    }

    @Override
    public List<Product> getByCatBrand(Category category, String brand) {
        return productRepository.findByCatBrand(category,brand);
    }

    @Override
    public List<Product> getByBrandName(String brand, String name) {
        return productRepository.findByBrandName(brand, name);
    }

    @Override
    public List<Product> findByBetweenPrice(double minPrice, double maxPrice) {
        return productRepository.findByBetweenPrice(minPrice, maxPrice);
    }

    @Override
    @Transactional
    public void updateProductCost(int productId, double price) {
        productRepository.updateProductCost(productId, price);
    }

    @Override
    public List<Product> getByNewBrands(String brand) {
        return productRepository.getByNewBrands(brand);
    }

    @Override
    public List<Product> getByNewBrandshow(String brand, double cost) {
        return productRepository.getByNewBrandshow(brand,cost);
    }

}
