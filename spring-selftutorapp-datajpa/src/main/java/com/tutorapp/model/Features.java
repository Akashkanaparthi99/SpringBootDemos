package com.tutorapp.model;

import lombok.*;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Features {
    @Id
    @GeneratedValue(generator = "details_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "details_gen",sequenceName = "details_sequence",initialValue = 100,allocationSize = 49)
    @ToString.Exclude
    private Integer featuresId;
    @Column(length = 30)
    private String featureName;

    public Features(String featureName) {
        this.featureName = featureName;
    }
}
