package org.myproject.appleservice.service;

import org.myproject.appleservice.Repository.StatusRepository;
import org.myproject.appleservice.model.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("StatusService")
@Transactional
public class StatusServiceImpl implements StatusService {
    @Autowired(required=false)
    private StatusRepository statusRepository;

    @Override
    public List<OrderStatus> findAll() {
        return statusRepository.findAll();
    }

    @Override
    public OrderStatus findByName(String name) {
        return statusRepository.findByName(name);
    }

    @Override
    public Optional findById(int id) {
        return statusRepository.findById((long) id);
    }
}
