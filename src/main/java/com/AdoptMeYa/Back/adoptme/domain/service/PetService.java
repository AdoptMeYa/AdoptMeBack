package com.AdoptMeYa.Back.adoptme.domain.service;

import com.AdoptMeYa.Back.adoptme.domain.model.entity.Pet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PetService {
    List<Pet> getAll();

    Page<Pet> getAll(Pageable pageable);

    Pet create(Pet pet);

    Pet getById(Long id);

    Pet update(Pet pet, Long id);

    ResponseEntity<?> delete(Long id);

}