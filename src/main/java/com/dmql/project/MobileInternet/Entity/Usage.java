package com.dmql.project.MobileInternet.Entity;

import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity(name = "usage")
@Where(clause = "deleted='false'")
@Data
public class Usage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer userId;

    @Column
    private Integer planId;

    @Column
    private Integer minutesused;

    @Column
    private Integer dataUsed;

    @Column
    private String serviceprovideraccountnumber;

    @Column
    private boolean deleted;
}

