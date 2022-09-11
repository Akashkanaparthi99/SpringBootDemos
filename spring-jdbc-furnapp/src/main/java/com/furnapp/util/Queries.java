package com.furnapp.util;

public class Queries {
    public static final String INSERTQUERY = "INSERT INTO FURNITURE(name,brand,price,category,style,material,room_type,storage_available) values (?,?,?,?,?,?,?,?)";
    public static final String DELETEQUERY = "DELETE FROM FURNITURE WHERE furnitureId = ?";
    public static final String UPDATEQUERY = "UPDATE FURNITURE SET price = ? WHERE furnitureId = ?";
    public static final String STYLEQUERY = "SELECT * FROM FURNITURE WHERE style = ?";
    public static final String MATERIALQUERY = "SELECT * FROM FURNITURE WHERE material = ?";
    public static final String ROOMQUERY = "SELECT * FROM FURNITURE WHERE room_type = ?";
    public static final String NAMEQUERY = "SELECT * FROM FURNITURE WHERE name = ?";
    public static final String CATEGORYQUERY = "SELECT * FROM FURNITURE WHERE category = ?";
    public static final String PRICEQUERY = "SELECT * FROM FURNITURE WHERE price > ? and price < ?";
    public static final String BRANDQUERY = "SELECT * FROM FURNITURE WHERE brand LIKE ?";
    public static final String IDQUERY = "SELECT * FROM FURNITURE WHERE furniture_id = ?";
    public static final String ANYTHINGQUERY = "SELECT * FROM FURNITURE WHERE furniture_id = ? OR style = ? OR material = ? OR room_type = ? OR category = ? OR price = ? OR brand = ?";

}
