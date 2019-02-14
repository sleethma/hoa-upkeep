package com.hoaupkeep.innosol.models;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Slf4j
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "plan_types")
public class PlanType extends BaseEntity {



    @Column(name = "plan_type")
    private String name;

    @Override
    public String toString(){
        return name;
    }
}
