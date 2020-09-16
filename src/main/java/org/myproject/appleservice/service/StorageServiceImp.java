package org.myproject.appleservice.service;

import org.myproject.appleservice.Repository.StorageRepository;
import org.myproject.appleservice.model.StorageComponents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("StorageService")
@Transactional
public class StorageServiceImp implements StorageService {
    @Autowired(required=false)
    private StorageRepository storageRepository;
    @Override
    public Optional findById(int id) {
        return storageRepository.findById((long) id);
    }

    @Override
    public void save(StorageComponents storageComponents) {
        storageRepository.save(storageComponents);
    }

    @Override
    public void deleteById(int id) {
        storageRepository.deleteById((long) id);
    }

    @Override
    public List<StorageComponents> findAllStorage() {
        return storageRepository.findAll();
    }
}
