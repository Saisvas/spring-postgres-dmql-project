package com.dmql.project.MobileInternet.Entity;

import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity(name = "serviceprovider")
@Where(clause = "deleted='false'")
@Data
public class ServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String providername;

    @Column
    private String established;

    @Column
    private String headQuarters;

    @Column
    private boolean deleted;
}

