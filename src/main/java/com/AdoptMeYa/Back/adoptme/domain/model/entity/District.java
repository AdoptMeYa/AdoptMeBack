package com.AdoptMeYa.Back.adoptme.domain.model.entity;
import com.AdoptMeYa.Back.shared.domain.model.AuditModel;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@With
@Table(name ="districts")

public class District extends AuditModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String district;

    @NotNull
    @NotBlank
    private String description;


}
