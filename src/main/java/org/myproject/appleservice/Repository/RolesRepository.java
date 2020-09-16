package org.myproject.appleservice.Repository;

import org.myproject.appleservice.model.Roles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolesRepository  extends CrudRepository<Roles, Long> {
    List<Roles> findAll();
    Roles findByName(String type);
}
