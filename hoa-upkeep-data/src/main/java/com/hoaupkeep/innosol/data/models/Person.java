package com.hoaupkeep.innosol.data.models;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Person extends BaseEntity{

    @Setter
    @Getter
    private String firstName;
    @Setter
    @Getter
    private String lastName;

    public Person(){}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
