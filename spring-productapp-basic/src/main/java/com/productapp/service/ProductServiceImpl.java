package com.productapp.service;

import com.productapp.dao.IProductDao;
import com.productapp.dao.ProductDaoImpl;
import com.productapp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductServiceImpl implements IProductService{

    @Autowired
    IProductDao productDao;

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }

    @Override
    public Product getById(int productId) {
        return productDao.getById(productId);
    }

    @Override
    public List<Product> getByCategory(String category) {
        return productDao.getByCategory(category);
    }

    @Override
    public List<Product> getByBrand(String brand) {
        return productDao.getByBrand(brand);

    }

}
