package com.mobile.service;

import com.mobile.model.CameraType;
import com.mobile.model.Seller;

import java.util.List;

public interface ISellerService {
    void addSeller(Seller seller);
    void updateSeller(Seller seller);
    void deleteSeller(int sellerId);
    Seller getById(int sellerId);

    List<Seller> getByCity(String city);
    List<Seller> getByRatings(double ratings);
    List<Seller> getByMobBrand(String brand);
    List<Seller> getByMobBrandCamera(String brand, CameraType camera);
    List<Seller> getByMobCamera(CameraType camera);
    List<Seller> getByMobBrandPrice(String brand, double price);
    List<Seller> getByMobOsMem(String os,String memory);

}
