package com.productapp.service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
@Service
public class ProductServiceImpl implements IProductService{

    private IProductRepository productRepository;
    @Autowired
    public void setProductRepository(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public void updateProduct(int productId, double price) {
        productRepository.updateProduct(productId, price);
    }

    @Override
    public void deleteProduct(int productId) {
        productRepository.deleteProduct(productId);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(int productId) throws ProductNotFoundException {
        Product product = productRepository.findById(productId);
        if (product == null){
            throw new ProductNotFoundException("No Products with id ->"+productId);
        }
        return product;
    }

    @Override
    public List<Product> getByCategory(String category) throws ProductNotFoundException{
        List<Product> products = productRepository.findByCategory(category);
        if (products.isEmpty()){
            throw new ProductNotFoundException("No Products in Category ->"+category);
        }
        return products;
    }

    @Override
    public List<Product> getByBrand(String brand) throws ProductNotFoundException{
        List<Product> products = productRepository.findByBrand(brand);
        if (products.isEmpty()){
            throw new ProductNotFoundException("No Products in brand ->"+brand);
        }
        return products;
    }

    @Override
    public List<Product> getByLesserPrice(double price) throws ProductNotFoundException{
        List<Product> products = productRepository.findByLesserPrice(price);
        if (products.isEmpty()){
            throw new ProductNotFoundException("No Products with less price ->"+price);
        }
        return products;
    }

    @Override
    public List<Product> getByBrandStarting(String brand) throws ProductNotFoundException{
        List<Product> products = productRepository.findByBrandStarting(brand);
        if (products.isEmpty()){
            throw new ProductNotFoundException("No Products with brand starting ->"+brand);
        }
        return products;
    }

    @Override
    public List<Product> getByExpiryDate(LocalDate expiryDate) {
        List<Product> products = productRepository.findByExpiryDate(expiryDate);
        if (products.isEmpty()){
            throw new ProductNotFoundException("No Products with expire date ->"+expiryDate);
        }
        return products;
    }
}
