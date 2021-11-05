package com.AdoptMeYa.Back.adoptme.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreateNotification {
    @NotNull private Long uerIdFrom;
    @NotNull private Long useridAt;
    @NotNull private String message;
    @NotNull private Long publicationId;
    @NotNull private Boolean approved;
}
