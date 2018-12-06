package com.hoaupkeep.innosol.data.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class House extends BaseEntity  {

    private PlanType planType;
    private Date buildDate;
    private Owner owner;


}
