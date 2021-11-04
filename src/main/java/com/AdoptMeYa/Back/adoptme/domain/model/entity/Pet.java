package com.AdoptMeYa.Back.adoptme.domain.model.entity;

import com.AdoptMeYa.Back.shared.domain.model.AuditModel;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@With
@Table(name = "pets")
public class Pet extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String type;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private String attention;

    @NotNull
    @NotBlank
    private String race;

    @NotNull
    private Integer age;

    @NotNull
    @NotBlank
    private String isAdopted;

}