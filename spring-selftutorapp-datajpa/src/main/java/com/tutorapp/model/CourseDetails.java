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
public class CourseDetails {
    @Id
    @GeneratedValue(generator = "details_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "details_gen",sequenceName = "details_sequence",initialValue = 100,allocationSize = 49)
    @ToString.Exclude
    private Integer coursedetailsId;
    @Column(length = 10)
    private String language;
    @Column(length = 40)
    private double rating;
    @Column(length = 40)
    private double fees;
    @Column(length = 40)
    private String description;
    @Column(length = 40)
    private int durationInHours;
    @Column(length = 40)
    private String level; // enum - beginner , intermediate , advanced
    @OneToMany
    Set<Features> featuresSet;

    public CourseDetails(String language, double rating, double fees, String description, int durationInHours, String level, Set<Features> featuresSet) {
        this.language = language;
        this.rating = rating;
        this.fees = fees;
        this.description = description;
        this.durationInHours = durationInHours;
        this.level = level;
        this.featuresSet = featuresSet;
    }
}
