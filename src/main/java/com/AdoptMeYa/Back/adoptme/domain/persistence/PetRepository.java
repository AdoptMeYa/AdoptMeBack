package com.AdoptMeYa.Back.adoptme.domain.persistence;

import com.AdoptMeYa.Back.adoptme.domain.model.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

    @Query(value =
            " SELECT pe FROM Pet pe INNER JOIN Publication pu " +
                    "on pe.publication.id = pu.id  WHERE pu.id = :id")
    List<Pet> ReadPetsByPublicationId(@Param("id")Long id);
}
