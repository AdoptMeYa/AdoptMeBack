package com.AdoptMeYa.Back.adoptme.resource;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CreateAdvertisementResource {
    @NotNull
    @NotBlank
    private Long userId;
    @NotBlank
    @NotNull
    private String dateTime;
    @NotBlank
    @NotNull
    private String title;
    @NotBlank
    @NotNull
    private String description;
    @NotBlank
    @NotNull
    private Float discount;
    @NotBlank
    @NotNull
    private String urlToImage;
    @NotBlank
    @NotNull
    private Boolean promoted;
}
