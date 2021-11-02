package com.AdoptMeYa.Back.adoptme.resource;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class AdvertisementResource {
    private Long id;
    private Long userId;
    private String dateTime;
    private String title;
    private String description;
    private Float discount;
    private String urlToImage;
    private Boolean promoted;
}
