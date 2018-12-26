package com.hoaupkeep.innosol.models;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.Date;

@Slf4j
@Getter
@Setter
public class Home extends BaseEntity{

    private PlanType planType;
    private LocalDate buildDate;
    private Owner owner;
    private String residentFirstName;
    private String residentLastName;
    private String propertyAddress;

}
