package com.productapp.util;

public class Queries {
    public static final String INSERTQUERY = "insert into product(name , brand , category , price,expirydate) values(?,?,?,?,?)";
    public static final String DELETEQUERY = "DELETE FROM PRODUCT WHERE productId = ?";
    public static final String UPDATEQUERY = "UPDATE PRODUCT SET price = ? WHERE productId = ?";

    public static final String SELECTQUERY = "SELECT * FROM PRODUCT";
    public static final String BRANDQUERY = "SELECT * FROM PRODUCT WHERE brand = ?";
    public static final String CATEGORYQUERY = "SELECT * FROM PRODUCT WHERE category = ?";
    public static final String PRICEQUERY = "SELECT * FROM PRODUCT WHERE price <= ?";
    public static final String BRANDSTARTINGQUERY = "SELECT * FROM PRODUCT WHERE brand like ?";
    public static final String DATEQUERY = "SELECT * FROM PRODUCT WHERE expirydate < ?";
    public static final String IDQUERY = "SELECT * FROM PRODUCT WHERE productId = ?";

}
