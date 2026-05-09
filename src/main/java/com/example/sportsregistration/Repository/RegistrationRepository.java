package com.example.sportsregistration.Repository;

import com.example.sportsregistration.entity.Registration;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegistrationRepository extends MongoRepository<Registration, String> {
}
