package com.AdoptMeYa.Back.adoptme.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PublicationResource {
    private Long id;
    private String comment;
    private int userId;
    private int petId;
}
