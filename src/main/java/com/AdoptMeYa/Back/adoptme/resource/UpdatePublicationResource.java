package com.AdoptMeYa.Back.adoptme.resource;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatePublicationResource {
    private Long id;
    @NotNull
    private String comment;
}