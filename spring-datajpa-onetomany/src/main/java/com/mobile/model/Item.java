package com.mobile.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Item {
    @Id
    @GeneratedValue(generator = "item_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "item_gen",sequenceName = "item_sequence",initialValue = 10,allocationSize = 5)
    private Integer itemId;
    @Column(length = 30)
    private String itemName;
    @Column(length = 30)
    @Enumerated(EnumType.STRING)
    private Cuisine cuisineType;
    @Column(length = 30)
    @Enumerated(EnumType.STRING)
    private Category category;
    @Column(length = 30)
    @Enumerated(EnumType.STRING)
    private Type type;
    @Column(length = 30)
    private double price;

    public Item(String itemName, Cuisine cuisineType, Category category, Type type, double price) {
        this.itemName = itemName;
        this.cuisineType = cuisineType;
        this.category = category;
        this.type = type;
        this.price = price;
    }
}
