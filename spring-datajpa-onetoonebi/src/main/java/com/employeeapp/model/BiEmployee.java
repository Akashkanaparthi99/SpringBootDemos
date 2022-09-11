package com.employeeapp.model;

import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Biemployee")
public class BiEmployee {
    @Column(length = 30)
    private String name;
    @Id
    @GeneratedValue(generator = "employee_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "employee_gen",sequenceName = "employee_seq",initialValue =10,allocationSize = 10)
    private Integer employeeId;
    @Column(length = 30)
    private String department;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private BiAddress address;

    public BiEmployee(String name, String department, BiAddress address) {
        this.name = name;
        this.department = department;
        this.address = address;
    }
}
