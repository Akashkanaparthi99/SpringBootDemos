package com.mobile.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(generator = "rest_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "rest_gen",sequenceName = "rest_sequence",initialValue = 10,allocationSize = 5)
    private Integer restaurantId;
    @Column(length = 30)
    private String restaurantName;
    @Column(length = 30)
    @Enumerated(EnumType.STRING)
    private Type type;
    @Column(length = 30)
    private String city;
    @Column(length = 30)
    private double rating;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id")
    private Set<Item> items;

    public Restaurant(String restaurantName, Type type, String city, double rating, Set<Item> items) {
        this.restaurantName = restaurantName;
        this.type = type;
        this.city = city;
        this.rating = rating;
        this.items = items;
    }
}
