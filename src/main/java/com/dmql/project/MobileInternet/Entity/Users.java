package com.dmql.project.MobileInternet.Entity;

import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;



@Entity(name = "users")
@Where(clause = "deleted='false'")
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String gender;

    @Column
    private String street;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String zip;

    @Column
    private String ssn;

    @Column
    private boolean deleted;
}
