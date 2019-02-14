package com.hoaupkeep.innosol.models;

import com.hoaupkeep.innosol.services.OwnerService;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Data
@EqualsAndHashCode(exclude = {"homes"})
@Entity
@Table(name = "owners")
public class Owner extends Person  {

    @Column(name = "address")
    private String address;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "city")
    private String city;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Home> homes = new HashSet<>();


    public Home getHome(String firstName, String lastName, boolean ignoreNew) {
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        for (Home home : homes) {
            if (!ignoreNew || !home.isNew()) {
                String compFirstName = home.getResidentFirstName().toLowerCase();
                String compLastName = home.getResidentLastName().toLowerCase();
                if (compFirstName.equals(firstName) && compLastName.equals(lastName)) {
                    return home;
                }
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Owner{" +
                "address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
