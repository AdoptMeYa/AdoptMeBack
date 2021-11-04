package com.AdoptMeYa.Back.adoptme.resource;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CreateAdvertisementResource {
    @NotNull
    private Long userId;

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
