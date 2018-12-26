package com.hoaupkeep.innosol.models;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
@Getter
@Setter
public class RepairRequest extends BaseEntity{

    private LocalDate date;
    private String repairDescription;
    private Home home;

}
