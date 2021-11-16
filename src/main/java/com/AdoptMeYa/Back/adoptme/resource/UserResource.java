package com.AdoptMeYa.Back.adoptme.resource;

import com.AdoptMeYa.Back.adoptme.domain.model.entity.District;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class UserResource {
    private Long id;
    private String email;
    private String password;
    private String type;
    private String user;
    private String ruc;
    private String dni;
    private String phone;
    private String name;
    private String lastname;
    private District district;
}
