package com.productapp.dao;

import com.productapp.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class ProductDaoImpl implements IProductDao{
    @Override
    public List<Product> getAll() {
        return showAllProducts();
    }

    @Override
    public Product getById(int productId) {
        for (Product products: getAll()) {
            if (products.getProductId() == productId)
                return products;
        }
        return null;
    }

    @Override
    public List<Product> getByCategory(String category) {
        List<Product> productList  = new ArrayList<>();
        for (Product product: getAll()) {
            if (product.getCategory().equalsIgnoreCase(category)){
                productList.add(product);
            }
        }
        return productList;
    }

    @Override
    public List<Product> getByBrand(String brand) {
        List<Product> productList  = new ArrayList<>();
        for (Product product: getAll()) {
            if (product.getBrand().equalsIgnoreCase(brand)){
                productList.add(product);
            }
        }
        return productList;
    }

    List<Product> showAllProducts(){
        return Arrays.asList(new Product("Samsung A53",123,35550.0,"Mobile","Samsung"),
                new Product("Samsung A73",133,45550.0,"Mobile","Samsung"),
                new Product("Samsung Easy Wash",103,55550.0,"Washing Machine","Samsung"),
                new Product("Lg Quick Dry",23,38550.0,"Washing Machine","LG"),
                new Product("High Star cool",453,18550.0,"Fan","Crompton"),
                new Product("IPhone 14",3,88550.0,"Mobile","Apple")
                );
    }
}
