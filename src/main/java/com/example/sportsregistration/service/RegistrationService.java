package com.example.sportsregistration.service;

import com.example.sportsregistration.Repository.RegistrationRepository;
import com.example.sportsregistration.entity.Registration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    private final RegistrationRepository repository;

    // Proper constructor injection
    public RegistrationService(RegistrationRepository repository) {
        this.repository = repository;
    }

    public Registration saveRegistration(Registration registration) {
        return repository.save(registration);
    }

    public Registration getRegistrationById(String id) {
        return repository.findById(id).orElse(null);
    }

    public List<Registration> getAllRegistrations() {
        return repository.findAll();
    }
}
