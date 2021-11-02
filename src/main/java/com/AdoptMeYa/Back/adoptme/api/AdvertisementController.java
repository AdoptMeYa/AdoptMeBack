package com.AdoptMeYa.Back.adoptme.api;

import com.AdoptMeYa.Back.adoptme.domain.model.entity.Advertisement;
import com.AdoptMeYa.Back.adoptme.domain.service.AdvertisementService;
import com.AdoptMeYa.Back.adoptme.mapping.AdvertisementMapper;
import com.AdoptMeYa.Back.adoptme.resource.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/advertisements")
public class AdvertisementController {
    @Autowired
    private AdvertisementService advertisementService;
    @Autowired
    private AdvertisementMapper mapper;
    @GetMapping("/{advertisementId}")
    public AdvertisementResource getAdvertisementById(@PathVariable("advertisementId") Long advertisementId) {
    return mapper.toResource(advertisementService.listAdvertisementsByUserId(advertisementId));
}
    @PostMapping
    public AdvertisementResource createPost(@RequestBody CreateAdvertisementResource request) {

        return mapper.toResource(advertisementService.create(mapper.toModel(request)));
    }
    @PutMapping("/{advertisementId}")
    public AdvertisementResource updatePost(@PathVariable Long advertisementId, @RequestBody UpdateAdvertisementResource request) {
        return mapper.toResource(advertisementService.update(advertisementId, mapper.toModel(request)));
    }

    @DeleteMapping("/{advertisementId}")
    public ResponseEntity<?> deletePost(@PathVariable Long advertisementId) {
        return advertisementService.delete(advertisementId);
    }

}
