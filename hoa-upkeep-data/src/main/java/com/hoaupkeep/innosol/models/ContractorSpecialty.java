package com.hoaupkeep.innosol.models;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Slf4j
@Getter
@Setter
@Entity
@Table(name = "contractor_specialties")
public class ContractorSpecialty extends BaseEntity {

    @Column(name = "description")
    private String specialty;
}
