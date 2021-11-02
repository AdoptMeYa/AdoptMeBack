package com.AdoptMeYa.Back.adoptme.resource;

import javax.validation.constraints.NotNull;

public class UpdateAdvertisementResource {
    private Long id;
    @NotNull
    private Long userId;
    @NotNull
    private String dateTime;
    @NotNull
    private String title;
    @NotNull
    private String description;
    @NotNull
    private Float discount;
    @NotNull
    private String urlToImage;
    @NotNull
    private Boolean promoted;
}
