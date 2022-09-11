package com.employeeapp.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Biaddress")
public class BiAddress {
    @Id
    @GeneratedValue(generator = "address_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "address_gen",sequenceName = "address_seq",initialValue = 1,allocationSize = 5)
    private Integer addressId;
    @Column(length = 30)
    private String flatNumber;
    @Column(length = 30)
    private String streetName;
    @Column(length = 30)
    private String city;
    @Column(length = 30)
    private String state;
    @Column(length = 30)
    private Integer zipcode;
    @OneToOne(mappedBy = "address")
    private BiEmployee employee;

    public BiAddress(String flatNumber, String streetName, String city, String state, Integer zipcode) {
        this.flatNumber = flatNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "BiAddress{" +
                "flatNumber='" + flatNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
