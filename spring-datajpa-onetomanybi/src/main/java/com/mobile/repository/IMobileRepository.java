package com.mobile.repository;

import com.mobile.model.CameraType;
import com.mobile.model.Mobile;
import com.mobile.model.Processor;
import com.mobile.model.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMobileRepository extends JpaRepository<Mobile,Integer> {


    List<Mobile> findAll();

    List<Mobile> findByBrand(String brand);
    @Query("from Mobile m where m.processor=?1")
    List<Mobile> findByProcessor(Processor processor);

    @Query("from Mobile m where m.cameraType=?1")
    List<Mobile> findByCamera(CameraType camera);

    @Query("from Mobile m where m.operatingSystem=?1")
    List<Mobile> findByOs(String os);

    @Query("from Mobile m where m.operatingSystem = ?1 and m.memory=?2")
    List<Mobile> findByOsAndMemory(String os , String memory);

    @Query("from Mobile m where m.processor=?1 and m.memory=?2")
    List<Mobile> findByProcessorAndMem(Processor processor , String memory);

    @Query("from Mobile m where m.storage=?1")
    List<Mobile> findByStorage(Storage storage);

    @Query("from Mobile m where m.brand=?1 and m.cameraType=?2")
    List<Mobile> findByBrandAndCamera(String brand , CameraType camera);
    @Query("from Mobile m where m.brand=?1 and m.price<?2")
    List<Mobile> findByBrandAndLessPrice(String brand , double price);
    @Query("from Mobile m inner join m.seller s where s.sellerName = ?1")
    List<Mobile> findBySellerName(String sellerName);
    @Query("from Mobile m inner join m.seller s where s.sellerName =?1 and s.city =?2")
    List<Mobile> findBySeller(String sellerName, String city);

}

//    List<Mobile> findAll();
//    List<Mobile> findByBrand(String brand);
//    @Query("from Mobile m where m.features f")
//    List<Mobile> findByProcessor(String processor);
//    List<Mobile> findByCameraType(String camera);
//    List<Mobile> findByOs(String os);
//
//    List<Mobile> findByOsAndMemory(String os , String memory);
//    List<Mobile> findByProcessorAndMem(String processor , String memory);
//    List<Mobile> findByStorage(Storage storage);
//    List<Mobile> findByBrandAndCamera(String brand , CameraType cameraType);
//    List<Mobile> findByBrandAndLessPrice(String brand , double price);

