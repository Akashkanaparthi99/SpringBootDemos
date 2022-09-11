package com.productapp.repository;

import com.productapp.model.Product;
import com.productapp.util.Queries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
@Repository
public class ProductRepositoryImpl implements IProductRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void addProduct(Product product) {
        Date expiryDate = Date.valueOf(product.getExpiryDate());
        Object[] productArray = {product.getName(),product.getBrand(),product.getCategory(),product.getPrice(),expiryDate};
        jdbcTemplate.update(Queries.INSERTQUERY,productArray);
    }

    @Override
    public void updateProduct(int productId, double price) {

        jdbcTemplate.update(Queries.UPDATEQUERY,price,productId);
    }

    @Override
    public void deleteProduct(int productId) {

        jdbcTemplate.update(Queries.DELETEQUERY,productId);
    }

    @Override
    public List<Product> findAll() {
//        return jdbcTemplate.query(Queries.SELECTQUERY,rs -> );
        RowMapper<Product> productMapper = new ProductMapper();
        return jdbcTemplate.query(Queries.SELECTQUERY,productMapper);
    }

    @Override
    public Product findById(int productId) {
        return jdbcTemplate.queryForObject(Queries.IDQUERY,(rs, rowNum) -> {
            Product product = new Product();
            String name = rs.getString("name");
            product.setName(name);
            product.setProductId(rs.getInt("productId"));
            product.setPrice(rs.getDouble("price"));
            product.setBrand(rs.getString("brand"));
            product.setCategory(rs.getString("category"));
            product.setExpiryDate(rs.getDate("expirydate").toLocalDate());
            return product;
        },productId);
//        return null;
    }

    @Override
    public List<Product> findByCategory(String category) {
        RowMapper<Product> mapper = new RowMapper<Product>() {
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
        };
        return jdbcTemplate.query(Queries.CATEGORYQUERY,mapper,category);
    }

    @Override
    public List<Product> findByBrand(String brand) {
        return jdbcTemplate.query(Queries.BRANDQUERY,new ProductMapper(),brand);
    }

    @Override
    public List<Product> findByLesserPrice(double price) {
        return jdbcTemplate.query(Queries.PRICEQUERY, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                Product product = new Product();
                product.setName(rs.getString("name"));
                product.setProductId(rs.getInt("productId"));
                product.setPrice(rs.getDouble("price"));
                product.setBrand(rs.getString("brand"));
                product.setCategory(rs.getString("category"));
                product.setExpiryDate(rs.getDate("expirydate").toLocalDate());
                return product;
            }
        }, price);
    }

    @Override
    public List<Product> findByBrandStarting(String brand) {
        return jdbcTemplate.query(Queries.BRANDSTARTINGQUERY,(rs, rowNum) ->{
            Product product = new Product();
            product.setName(rs.getString("name"));
            product.setProductId(rs.getInt("productId"));
            product.setPrice(rs.getDouble("price"));
            product.setBrand(rs.getString("brand"));
            product.setCategory(rs.getString("category"));
            product.setExpiryDate(rs.getDate("expirydate").toLocalDate());
            return product;
        },brand+"%");
    }

    @Override
    public List<Product> findByExpiryDate(LocalDate expiryDate) {
        return jdbcTemplate.query(Queries.DATEQUERY,new ProductMapper(),Date.valueOf(expiryDate));
    }
}
