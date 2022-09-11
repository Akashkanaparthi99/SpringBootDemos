package com.tutorapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Course {

    @Column(length = 40)
    private String courseName;

    @Id
    @GeneratedValue(generator = "course_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "course_gen",sequenceName = "course_sequence",initialValue = 1,allocationSize = 1)
    private Integer courseId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coursedetails_id")// this ID will be added as foreign key on this table
    private CourseDetails courseDetails;

    @ManyToOne
    @JoinColumn(name = "trainer_id")//this ID will be added as a foreign key in course table
    private Trainer trainer;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id") // this is added as foreign key
    private Set<Features> features; // one course can have many features like assignments , quiz.... etc.,

    @ManyToMany(cascade = CascadeType.MERGE)
            @JoinTable(
                    name = "course_category",
                    joinColumns = @JoinColumn(name = "course_id"),
                    inverseJoinColumns = @JoinColumn(name = "category_id")
            )

    private Set<Category> categories;

    public Course(String courseName, CourseDetails courseDetails, Set<Features> features) {
        this.courseName = courseName;
        this.courseDetails = courseDetails;
        this.features = features;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseDetails=" + courseDetails +
                '}';
    }
}
