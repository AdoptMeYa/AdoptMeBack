package com.AdoptMeYa.Back.adoptme.api;

import com.AdoptMeYa.Back.adoptme.domain.service.PetService;
import com.AdoptMeYa.Back.adoptme.mapping.PetMapper;
import com.AdoptMeYa.Back.adoptme.mapping.PublicationMapper;
import com.AdoptMeYa.Back.adoptme.resource.CreatePetResource;
import com.AdoptMeYa.Back.adoptme.resource.PetResource;
import com.AdoptMeYa.Back.adoptme.resource.UpdatePetResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/pets")
public class PetController {
    @Autowired
    private PetService petService;

    @Autowired
    private PetMapper mapper;


    @GetMapping
    public Page<PetResource> getAll(Pageable pageable) {
        return  mapper.modelListToPage(petService.getAll(), pageable);
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
