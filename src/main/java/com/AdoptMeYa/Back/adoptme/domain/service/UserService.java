package com.AdoptMeYa.Back.adoptme.domain.service;

import com.AdoptMeYa.Back.adoptme.domain.model.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getAll();

    Page<User> getAll(Pageable pageable);

    User create(User user);

    User getById(Long id);

    User update(User user, Long id);

    ResponseEntity<?> delete(Long id);
}
