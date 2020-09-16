package org.myproject.appleservice.Repository;

import org.myproject.appleservice.model.StorageComponents;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StorageRepository extends CrudRepository<StorageComponents, Long> {
    List<StorageComponents> findAll();
}
