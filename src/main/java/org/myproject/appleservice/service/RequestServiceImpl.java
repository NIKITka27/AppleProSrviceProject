package org.myproject.appleservice.service;

import org.myproject.appleservice.Repository.RequestRepository;
import org.myproject.appleservice.model.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("RequestService")
@Transactional
public class RequestServiceImpl implements  RequestService{
    @Autowired(required=false)
    private RequestRepository requestRepository;

    @Override
    public Optional findById(int id) {
        return requestRepository.findById((long) id);
    }

    @Override
    public void save(Request request) {
        requestRepository.save(request);
    }

    @Override
    public void deleteById(int id) {
        requestRepository.deleteById((long) id);
    }

    @Override
    public List<Request> findAllRequest() {
        return requestRepository.findAll();
    }
}
