package com.example.sportsregistrationApplicationTests.Repository;

import com.example.sportsregistrationApplicationTests.entity.Registration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends MongoRepository<Registration, String> {
}
