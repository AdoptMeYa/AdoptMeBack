package com.AdoptMeYa.Back.adoptme.domain.model.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import com.AdoptMeYa.Back.shared.domain.model.AuditModel;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.With;
@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@With
@Table(name = "notifications")

public class Notification extends AuditModel {
    @NotNull @Id
    private Long id;
    @NotNull
    private Long user_Id;
    private Long user_At;
    private Boolean approved;
    private String message;
    @NotNull
    private Long publication_id;


}
