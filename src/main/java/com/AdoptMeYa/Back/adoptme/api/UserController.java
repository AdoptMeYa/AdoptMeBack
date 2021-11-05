package com.AdoptMeYa.Back.adoptme.api;

import com.AdoptMeYa.Back.adoptme.domain.service.UserService;
import com.AdoptMeYa.Back.adoptme.mapping.UserMapper;
import com.AdoptMeYa.Back.adoptme.resource.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper mapper;


    @GetMapping
    public Page<UserResource> getAllPet(Pageable pageable) {
        return  mapper.modelListToPage(userService.getAll(), pageable);
    }

    @PostMapping
    public UserResource createPet(@RequestBody CreateUserResource request){
        return mapper.toResource(userService.create(mapper.toModel(request)));
    }

    @GetMapping("/{id}")
    public UserResource getById(@PathVariable("id") Long id){
        return mapper.toResource(userService.getById(id));
    }

    @PutMapping("/{id}")
    public UserResource put(@RequestBody UpdateUserResource request, @PathVariable("id") Long id){
        return mapper.toResource(userService.update(mapper.toModel(request), id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deletePost(@PathVariable Long id) {
        return userService.delete(id);
    }




}
