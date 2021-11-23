package com.AdoptMeYa.Back.adoptme.resource;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreatePublicationResource {
    @NotNull
    private String comment;
    @NotNull
    private int userId;
    @NotNull
    private int petId;

}
