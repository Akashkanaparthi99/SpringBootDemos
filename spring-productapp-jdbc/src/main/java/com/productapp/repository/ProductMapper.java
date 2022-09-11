package com.productapp.repository;

import com.productapp.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        String name = rs.getString("name");
        product.setName(name);
        product.setProductId(rs.getInt("productId"));
        product.setPrice(rs.getDouble("price"));
        product.setBrand(rs.getString("brand"));
        product.setCategory(rs.getString("category"));
        product.setExpiryDate(rs.getDate("expirydate").toLocalDate());
        return product;
    }
}
