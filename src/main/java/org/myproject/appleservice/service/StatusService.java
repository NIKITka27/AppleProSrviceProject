package org.myproject.appleservice.service;

import org.myproject.appleservice.model.OrderStatus;

import java.util.List;
import java.util.Optional;

public interface StatusService {
    List<OrderStatus> findAll();

    OrderStatus findByName(String name);

    Optional findById(int id);
}
