package com.AdoptMeYa.Back.adoptme.domain.persistence;

import com.AdoptMeYa.Back.adoptme.domain.model.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    @Query(nativeQuery = false,value = " SELECT p FROM Pet p WHERE p.publication.id = :id")
    Pet ReadPetsByPublicationId(@Param("id")Long id);
}
