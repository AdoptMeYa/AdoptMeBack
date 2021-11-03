package com.AdoptMeYa.Back.adoptme.resource;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Setter
@Getter
public class CreatePetResource {

    @NotNull
    private String type;

    @NotNull
    private String name;

    @NotNull
    private String attention;

    @NotNull
    private String race;

    @NotNull
    private Integer age;

    @NotNull
    private String isAdopted;
}
