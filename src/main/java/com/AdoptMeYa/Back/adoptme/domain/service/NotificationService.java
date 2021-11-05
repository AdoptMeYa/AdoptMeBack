package com.AdoptMeYa.Back.adoptme.domain.service;

import com.AdoptMeYa.Back.adoptme.domain.model.entity.Notification;
import com.AdoptMeYa.Back.adoptme.domain.model.entity.Publication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NotificationService {


    List<Notification> getAll();

    Notification getById(Long Id);
    Notification create(Notification Notification);
    Notification update(Long Id, Notification request);
    ResponseEntity<?> delete(Long Id);

}
