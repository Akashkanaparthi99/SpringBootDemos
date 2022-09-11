package com.mobile.service;

import com.mobile.model.CameraType;
import com.mobile.model.Mobile;
import com.mobile.model.Processor;
import com.mobile.model.Storage;
import com.mobile.repository.IMobileRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MobileServiceImpl implements IMobileService{

    IMobileRepository mobileRepository;

    public MobileServiceImpl(IMobileRepository mobileRepository) {
        this.mobileRepository = mobileRepository;
    }

    @Override
    public List<Mobile> getAll() {
        return mobileRepository.findAll();
    }

    @Override
    public List<Mobile> getByBrand(String brand) {
        return mobileRepository.findByBrand(brand);
    }

    @Override
    public List<Mobile> getByProcessor(Processor processor) {
        return mobileRepository.findByProcessor(processor);
    }

    @Override
    public List<Mobile> getByCameraType(CameraType camera) {
        return mobileRepository.findByCamera(camera);
    }

    @Override
    public List<Mobile> getByOs(String os) {
        return mobileRepository.findByOs(os);
    }

    @Override
    public List<Mobile> getByOsAndMemory(String os, String memory) {
        return mobileRepository.findByOsAndMemory(os, memory);
    }

    @Override
    public List<Mobile> getByProcessorAndMem(Processor processor, String memory) {
        return mobileRepository.findByProcessorAndMem(processor, memory);
    }

    @Override
    public List<Mobile> getByStorage(Storage storage) {
        return mobileRepository.findByStorage(storage);
    }

    @Override
    public List<Mobile> getByBrandAndCamera(String brand, CameraType cameraType) {
        return mobileRepository.findByBrandAndCamera(brand, cameraType);
    }

    @Override
    public List<Mobile> getByBrandAndLessPrice(String brand, double price) {
        return mobileRepository.findByBrandAndLessPrice(brand, price);
    }

    @Override
    public List<Mobile> getBySellerName(String sellerName) {
        return mobileRepository.findBySellerName(sellerName);
    }

    @Override
    public List<Mobile> getBySeller(String sellerName, String city) {
        return mobileRepository.findBySeller(sellerName, city);
    }
}
