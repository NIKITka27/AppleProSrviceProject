package org.myproject.appleservice.service;

import org.myproject.appleservice.model.Device;

import java.util.List;
import java.util.Optional;

public interface DeviceService {
    Optional findById(int id);

    void save(Device device);

    void deleteById(int id);

    List<Device> findAllDevice();
}
