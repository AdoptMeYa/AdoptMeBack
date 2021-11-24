package com.AdoptMeYa.Back.adoptme.api;

import com.AdoptMeYa.Back.adoptme.domain.model.entity.Pet;
import com.AdoptMeYa.Back.adoptme.domain.service.PetService;
import com.AdoptMeYa.Back.adoptme.mapping.PetMapper;
import com.AdoptMeYa.Back.adoptme.resource.CreatePetResource;
import com.AdoptMeYa.Back.adoptme.resource.PetResource;
import com.AdoptMeYa.Back.adoptme.resource.UpdatePetResource;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    private PetService petService;

    @Autowired
    private PetMapper mapper;


    @GetMapping
    public List<PetResource> getAll() {
        return  mapper.toListResource(petService.getAll());
    }

    @GetMapping("/publicationId={id}")
    public List<PetResource> ReadPetsByPublicationId(@PathVariable("id") Long id) {
        return  mapper.toListResource(petService.ReadPetsByPublicationId(id));
    }

    @PostMapping
    public PetResource createPet(@RequestBody CreatePetResource request){
        return mapper.toResource(petService.create(mapper.toModel(request)));
    }

    @GetMapping("/{id}")
    public PetResource getById(@PathVariable("id") Long id){
        return mapper.toResource(petService.getById(id));
    }

    @PutMapping("/{id}")
    public PetResource put(@RequestBody UpdatePetResource request, @PathVariable("id") Long id){
        return mapper.toResource(petService.update(mapper.toModel(request), id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deletePost(@PathVariable Long id) {
        return petService.delete(id);
    }



}
