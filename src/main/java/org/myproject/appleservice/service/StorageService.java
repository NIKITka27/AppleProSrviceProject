package org.myproject.appleservice.service;

import org.myproject.appleservice.model.StorageComponents;

import java.util.List;
import java.util.Optional;

public interface StorageService {
    Optional findById(int id);

    void save(StorageComponents storageComponents);

    void deleteById(int id);

    List<StorageComponents> findAllStorage();
}
