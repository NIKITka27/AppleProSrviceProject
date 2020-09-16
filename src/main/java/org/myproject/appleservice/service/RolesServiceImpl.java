package org.myproject.appleservice.service;

import org.myproject.appleservice.Repository.RolesRepository;
import org.myproject.appleservice.model.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("RolesService")
@Transactional
public class RolesServiceImpl implements RolesService {
    @Autowired(required=false)
    private RolesRepository rolesRepository;

    @Override
    public List<Roles> findAll() {
        return rolesRepository.findAll();
    }

    @Override
    public Roles findByType(String name) {
        return rolesRepository.findByName(name);
    }

    @Override
    public Optional findById(int id) {
        return rolesRepository.findById((long) id);
    }
}
