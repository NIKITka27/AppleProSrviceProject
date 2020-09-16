package org.myproject.appleservice.service;

import org.myproject.appleservice.model.Request;

import java.util.List;
import java.util.Optional;

public interface RequestService {
    Optional findById(int id);

    void save(Request request);

    void deleteById(int id);

    List<Request> findAllRequest();
}
