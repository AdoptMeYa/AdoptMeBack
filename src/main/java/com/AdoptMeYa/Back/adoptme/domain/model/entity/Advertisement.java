package com.AdoptMeYa.Back.adoptme.domain.model.entity;

import com.AdoptMeYa.Back.shared.domain.model.AuditModel;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@With
@Table(name="advertisements")
public class Advertisement extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long userId;


    @NotNull
    @NotBlank
    @Size(max = 100)
    @Column(unique = false)
    private String title;

    @NotNull
    @NotBlank
    @Size(max = 100)
    @Column(unique = false)
    private String description;

    @NotNull
    @Column(unique = false)
    private Float discount;

    @NotNull
    @NotBlank
    @Size(max = 300)
    @Column(unique = false)
    private String urlToImage;

    @NotNull
    @Column(unique = false)
    private Boolean promoted;

}
