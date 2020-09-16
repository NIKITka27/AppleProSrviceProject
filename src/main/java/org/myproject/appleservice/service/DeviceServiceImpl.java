package org.myproject.appleservice.service;

import org.myproject.appleservice.Repository.DeviceRepository;
import org.myproject.appleservice.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("DeviceService")
@Transactional
public class DeviceServiceImpl implements DeviceService {

    @Autowired(required=false)
    public DeviceRepository deviceRepository;

    @Override
    public Optional findById(int id) {
        return deviceRepository.findById((long) id);
    }

    @Override
    public void save(Device device) {
        deviceRepository.save(device);
    }

    @Override
    public void deleteById(int id) {
        deviceRepository.deleteById((long) id);
    }

    @Override
    public List<Device> findAllDevice() {
        return deviceRepository.findAll();
    }
}
