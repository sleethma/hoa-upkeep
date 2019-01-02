package com.hoaupkeep.innosol.models;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Slf4j
@Getter
@Setter
@Entity
@Table(name = "homes")
public class Home extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PlanType planType;

    @Column(name = "build_date")
    private LocalDate buildDate;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "resident_first_name")
    private String residentFirstName;

    @Column(name = "resident_last_name")
    private String residentLastName;

    @Column(name = "property_address")
    private String propertyAddress;

}
