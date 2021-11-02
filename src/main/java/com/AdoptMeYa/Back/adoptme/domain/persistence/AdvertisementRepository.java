package com.AdoptMeYa.Back.adoptme.domain.persistence;

import com.AdoptMeYa.Back.adoptme.domain.model.entity.Advertisement;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {

}
