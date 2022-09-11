package com.tutorapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Table(name = "subcategory")
public class SubCategory {

    @Id
    @GeneratedValue(generator = "subcategory_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "subcategory_gen",sequenceName = "subcategory_sequence",initialValue = 5,allocationSize = 4)
    @ToString.Exclude
    private Integer subCategoryId;
    @Column(length = 40)
    private String subcategoryName;
    @Column(length = 30)
    private String topic;//HTML5 REACT CSS SPRING

    public SubCategory(String subcategoryName, String topic) {
        this.subcategoryName = subcategoryName;
        this.topic = topic;
    }
}
