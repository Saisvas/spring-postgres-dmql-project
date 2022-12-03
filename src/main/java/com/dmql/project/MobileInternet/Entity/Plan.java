package com.dmql.project.MobileInternet.Entity;

import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity(name = "plan")
@Where(clause = "deleted='false'")
@Data
public class Plan {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer cost;

    @Column
    private String currency;

    @Column
    private Integer serviceproviderid;

    @Column
    private Integer talktimeinmins;

    @Column
    private Integer dataingb;

    @Column
    private Integer validityinmonths;

    @Column
    private String networktype;

    @Column
    private Boolean deleted;
}

