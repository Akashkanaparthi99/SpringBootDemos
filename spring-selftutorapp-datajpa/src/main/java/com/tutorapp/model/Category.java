package com.tutorapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Category {
    @Column(length = 40)
    private String categoryName;
    @Id
    @GeneratedValue(generator = "category_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "category_gen",sequenceName = "category_sequence",initialValue = 50,allocationSize = 50)
    @ToString.Exclude
    private Integer categoryId;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
            @JoinColumn(name = "category_id")
    Set<SubCategory> subCategories;

    public Category(String categoryName, Set<SubCategory> subCategory) {
        this.categoryName = categoryName;
        this.subCategories = subCategory;
    }
}
