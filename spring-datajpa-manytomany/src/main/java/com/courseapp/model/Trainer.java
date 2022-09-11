package com.courseapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Trainer {
    @Column(length = 40)
    private String trainerName;
    @Id
    @GeneratedValue(generator = "trainer_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "trainer_gen",sequenceName = "trainer_sequence",initialValue = 5,allocationSize = 10)
    @ToString.Exclude
    private Integer trainerId;
    @Column(length = 40)
    private double rating;
    @Column(length = 40)
    private int experience;
    @Column(length = 40)
    private String techStack;
    @Column(length = 40)
    private LocalDate joiningDate;
    // mappedBy uses the instance variable
    @ManyToMany(mappedBy = "trainers")
    @ToString.Exclude
    Set<Course> courses;

    public Trainer(String trainerName, double rating, int experience, String techStack, LocalDate joiningDate) {
        this.trainerName = trainerName;
        this.rating = rating;
        this.experience = experience;
        this.techStack = techStack;
        this.joiningDate = joiningDate;
    }
}
