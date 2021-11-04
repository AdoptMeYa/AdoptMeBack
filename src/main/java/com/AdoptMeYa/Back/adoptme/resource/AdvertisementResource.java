package com.AdoptMeYa.Back.adoptme.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdvertisementResource {
    private Long id;
    private Long userId;
    private String title;
    private String description;
    private Float discount;
    private String urlToImage;
    private Boolean promoted;
}
