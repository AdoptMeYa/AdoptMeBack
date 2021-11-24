package com.AdoptMeYa.Back.adoptme.domain.persistence;

import com.AdoptMeYa.Back.adoptme.domain.model.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {


    @Query(value =
            " SELECT r FROM Pet r WHERE r.id = 1")
    Collection<Pet> ReadPetsByPublicationId(@Param("id")Long id);
}
