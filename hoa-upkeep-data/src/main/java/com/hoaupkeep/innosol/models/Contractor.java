package com.hoaupkeep.innosol.models;

import com.hoaupkeep.innosol.services.ContractorService;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Getter
@Setter
public class Contractor extends Person {

Set<ContractorSpecialty> specialties = new HashSet<>();
}
