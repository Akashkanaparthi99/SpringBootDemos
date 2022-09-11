package com.tutorapp.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Trainer {
    @Column(length = 40)
    private String trainerName;
    @Id
    @GeneratedValue(generator = "trainer_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "trainer_gen",sequenceName = "trainer_sequence",initialValue = 10,allocationSize = 10)
    private Integer trainerId;
    @Column(length = 40)
    private double rating;
    @Column(length = 40)
    private int experience;
    @Column(length = 40)
    private String techStack;
    @Column(length = 40)
    private int noOfStudents;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "trainer_id")
    private Set<Course> courses;

    public Trainer(String trainerName, double rating, int experience, String techStack, int noOfStudents) {
        this.trainerName = trainerName;
        this.rating = rating;
        this.experience = experience;
        this.techStack = techStack;
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerName='" + trainerName + '\'' +
                ", rating=" + rating +
                ", experience=" + experience +
                ", techStack='" + techStack + '\'' +
                ", noOfStudents=" + noOfStudents +
                '}';
    }
}
