package com.mobile.service;

import com.mobile.model.CameraType;
import com.mobile.model.Mobile;
import com.mobile.model.Processor;
import com.mobile.model.Storage;

import java.util.List;

public interface IMobileService {
//    Mobile addMobile(Mobile mobile);
//    Mobile getById(int mobileId);

//    void updateMobile(Mobile mobile);
//    void deleteMobile(int mobileId);

    List<Mobile> getAll();
    List<Mobile> getByBrand(String brand);
    List<Mobile> getByProcessor(Processor processor);
    List<Mobile> getByCameraType(CameraType camera);
    List<Mobile> getByOs(String os);

    List<Mobile> getByOsAndMemory(String os , String memory);
    List<Mobile> getByProcessorAndMem(Processor processor , String memory);
    List<Mobile> getByStorage(Storage storage);
    List<Mobile> getByBrandAndCamera(String brand , CameraType cameraType);
    List<Mobile> getByBrandAndLessPrice(String brand , double price);

    List<Mobile> getBySellerName(String sellerName);
    List<Mobile> getBySeller(String sellerName, String city);

}


