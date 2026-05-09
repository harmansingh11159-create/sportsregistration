package com.example.sportsregistrationApplicationTests.service;

import com.example.sportsregistrationApplicationTests.Repository.RegistrationRepository;
import com.example.sportsregistrationApplicationTests.entity.Registration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    private final RegistrationRepository repository;

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
