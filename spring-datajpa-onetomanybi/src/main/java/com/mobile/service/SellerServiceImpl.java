package com.mobile.service;

import com.mobile.model.CameraType;
import com.mobile.model.Seller;
import com.mobile.repository.ISellerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SellerServiceImpl implements ISellerService{

    ISellerRepository sellerRepository;

    public SellerServiceImpl(ISellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    @Override
    public void addSeller(Seller seller) {
        sellerRepository.save(seller);
    }

    @Override
    public void updateSeller(Seller seller) {
        sellerRepository.save(seller);
    }

    @Override
    public void deleteSeller(int sellerId) {
        sellerRepository.deleteById(sellerId);
    }

    @Override
    public Seller getById(int sellerId) {
        return sellerRepository.findById(sellerId);
    }

    @Override
    public List<Seller> getByCity(String city) {
        return sellerRepository.findByCity(city);
    }

    @Override
    public List<Seller> getByRatings(double ratings) {
        return sellerRepository.findByRating(ratings);
    }

    @Override
    public List<Seller> getByMobBrand(String brand) {
        return sellerRepository.findByMobBrand(brand);
    }

    @Override
    public List<Seller> getByMobBrandCamera(String brand, CameraType camera) {
        return sellerRepository.findByMobBrandCamera(brand, camera);
    }

    @Override
    public List<Seller> getByMobCamera(CameraType camera) {
        return sellerRepository.findByMobCamera(camera);
    }

    @Override
    public List<Seller> getByMobBrandPrice(String brand, double price) {
        return sellerRepository.findByBrandAndPrice(brand, price);
    }

    @Override
    public List<Seller> getByMobOsMem(String os, String memory) {
        return sellerRepository.findByMobOsMem(os, memory);
    }
}
