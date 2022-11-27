package com.dmql.project.MobileInternet.Entity;

import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity(name = "coverage")
@Where(clause = "deleted='false'")
@Data
public class Coverage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer serviceproviderid;

    @Column
    private String signalStrength;

    @Column
    private String zipcode;

    @Column
    private String networktype;

    @Column
    private boolean deleted;
}

