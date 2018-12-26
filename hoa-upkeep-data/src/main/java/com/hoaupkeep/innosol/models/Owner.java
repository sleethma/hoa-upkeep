package com.hoaupkeep.innosol.models;

import com.hoaupkeep.innosol.services.OwnerService;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;

@Slf4j
@Getter
@Setter
public class Owner extends Person  {

    Set<Home> homes;

}
