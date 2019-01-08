package com.hoaupkeep.innosol.models;

import com.hoaupkeep.innosol.services.ContractorService;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Data
@Entity
@Table(name = "contractors")
public class Contractor extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
      @JoinTable(name = "contractor_specialties",
              joinColumns = @JoinColumn(name = "contractor_id"),
              inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    Set<ContractorSpecialty> specialties = new HashSet<>();
}
