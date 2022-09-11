package com.mobile.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Mobile {
    @Column(length = 30)
    private String model;
    @Column(length = 30)
    private String brand;
    @Id
    @GeneratedValue(generator = "mobile_generator",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "mobile_generator",sequenceName = "mobile_sequence",initialValue = 20,allocationSize = 1)
    private Integer mobileId;
    @Column(length = 30)
    private double price;
    @Column(length = 30)
    @Enumerated(EnumType.STRING)
    private Processor processor;
    @Column(length = 30)
    private String memory; // 4GB, 8GB , 12GB , 16GB
    @Column(length = 30)
    @Enumerated(EnumType.STRING)
    private CameraType cameraType;
//    @Enumerated(EnumType.STRING)
//    private Rear rearCamera;
    @Column(length = 30)
    private String operatingSystem;
    @Column(length = 30)
    private String storage;
//    @ManyToOne
//    @OneToMany(mappedBy = "mobiles")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "seller_id")
    private Seller seller;
//    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    private Set<Features> features;


    public Mobile(String model, String brand, double price, Processor processor, String memory, CameraType cameraType, String operatingSystem, String storage) {
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.cameraType = cameraType;
        this.processor = processor;
        this.memory = memory;
        this.operatingSystem = operatingSystem;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", processor=" + processor +
                ", memory='" + memory + '\'' +
                ", cameraType=" + cameraType +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}
