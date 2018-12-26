package com.hoaupkeep.innosol.models;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
@Getter
@Setter
public class Home extends BaseEntity{

    private PlanType planType;
    private Date buildDate;
    private Owner owner;

}
