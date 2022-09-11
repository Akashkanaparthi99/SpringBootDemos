package com.mobile.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seller {
    @Column(length = 30)
    private String sellerName;
    @Id
    @GeneratedValue(generator = "seller_generator",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "seller_generator",sequenceName = "seller_sequence",initialValue = 10,allocationSize = 1)
    private Integer sellerId;
    @Column(length = 30)
    private double rating;
    @Column(length = 30)
    private String city;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "seller_id")
    private Set<Mobile> mobiles;

    public Seller(String sellerName, double rating, String city, Set<Mobile> mobiles) {
        this.sellerName = sellerName;
        this.rating = rating;
        this.city = city;
        this.mobiles = mobiles;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerName='" + sellerName + '\'' +
                ", rating=" + rating +
                ", city='" + city + '\'' +
                ", mobiles=" + mobiles +
                '}';
    }
}
