package com.AdoptMeYa.Back.adoptme.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetResource {
    private Long id;
    private String type;
    private String name;
    private String attention;
    private String race;
    private Integer age;
    private String isAdopted;
}
