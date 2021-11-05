package com.AdoptMeYa.Back.adoptme.resource;

import javax.validation.constraints.NotNull;

public class UpdateNotificationResource {
    @NotNull
    private Long id;
    @NotNull
    private Long uerIdFrom;
    @NotNull
    private Long useridAt;
    @NotNull
    private String message;
    @NotNull
    private Long publicationId;
    @NotNull
    private Long approved;
}
