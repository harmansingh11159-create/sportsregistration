package com.example.sportsregistration.Repository;

import com.example.sportsregistration.entity.Registration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends MongoRepository<Registration, String> {

    // Example custom query (optional)
    // List<Registration> findBySport(String sport);
}