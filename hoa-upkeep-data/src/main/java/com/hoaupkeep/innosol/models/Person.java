package com.hoaupkeep.innosol.models;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Slf4j
@MappedSuperclass
public class Person extends BaseEntity{

    @Setter
    @Getter
    @Column(name = "first_name")
    private String firstName;
    @Setter
    @Getter
    @Column(name = "last_name")
    private String lastName;

    public Person(){}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
