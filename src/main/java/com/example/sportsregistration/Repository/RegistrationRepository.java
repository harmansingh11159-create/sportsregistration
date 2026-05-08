package com.example.sportsregistration.Repository;

import com.example.sportsregistration.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    // You don’t need to redeclare findAll(), findById(), or save()
    // JpaRepository already provides them.

    // Example: you can add custom queries if needed
    // List<Registration> findByCategory(String category);
}

