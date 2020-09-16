package org.myproject.appleservice.service;

import org.myproject.appleservice.model.Roles;

import java.util.List;
import java.util.Optional;

public interface RolesService {
    List<Roles> findAll();

    Roles findByType(String name);

    Optional findById(int id);
}
