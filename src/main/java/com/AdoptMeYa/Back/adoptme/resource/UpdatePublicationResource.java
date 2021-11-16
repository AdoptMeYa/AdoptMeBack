package com.AdoptMeYa.Back.adoptme.resource;

import javax.validation.constraints.NotNull;

import com.AdoptMeYa.Back.adoptme.domain.model.entity.Pet;
import com.AdoptMeYa.Back.adoptme.domain.model.entity.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatePublicationResource {
    private Long id;
    @NotNull
    private String comment;

    private Pet pet;
    private User user;
}