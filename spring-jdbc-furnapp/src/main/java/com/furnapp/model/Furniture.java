package com.furnapp.model;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Furniture {
    private String name ; // 4 seater dining table
    private Category category; // chair , table , bed
    private String roomType; // living, dining, study
    private String material; // wood , steel, plastic
    @Id
    @GeneratedValue(generator = "furn_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "furn_gen",initialValue = 2396,allocationSize = 1)
    private Integer furnitureId;
    private String brand;
    private Style style; // contemporary, modern, traditional
    private double price;
    private boolean storageAvailabe;

    public Furniture(String name, Category category, String roomType, String material, String brand, Style style, double price, boolean storageAvailabe) {
        this.name = name;
        this.category = category;
        this.roomType = roomType;
        this.material = material;
        this.brand = brand;
        this.style = style;
        this.price = price;
        this.storageAvailabe = storageAvailabe;
    }
}
