package com.courseapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Course {
    @Column(length = 40)
    private String courseName;
    @Id
    @GeneratedValue(generator = "course_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "course_gen",sequenceName = "course_sequence",initialValue = 15,allocationSize = 3)
    @ToString.Exclude
    private Integer courseId;
    @Column(length = 40)
    private double fees;
    @Column(length = 40)
    private int durationInDays;
    private String category;
    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @ToString.Exclude
    @JoinTable(name = "course_trainer",joinColumns = {@JoinColumn(name = "course_id")},// refers to the primary key of the owner entity
            inverseJoinColumns = {@JoinColumn(name = "trainer_id")})// refers to the primary key of the other entity
    private Set<Trainer> trainers;



    public Course(String courseName, double fees, int durationInDays, String category) {
        this.courseName = courseName;
        this.fees = fees;
        this.durationInDays = durationInDays;
        this.category = category;
    }
}
