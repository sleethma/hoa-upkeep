package com.hoaupkeep.innosol.hoaupkeep.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class House  {
    @Setter
    @Getter
    private PlanType planType;
    @Setter
    @Getter
    private Date buildDate;
    @Setter
    @Getter
    private Owner owner;


}
