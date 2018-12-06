package com.hoaupkeep.innosol.data.models;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import java.io.Serializable;

@Slf4j
@Getter
@Setter
public class BaseEntity implements Serializable {

    //use object Long as to allow null (recommended by Hibernate)
    private Long id;
}
