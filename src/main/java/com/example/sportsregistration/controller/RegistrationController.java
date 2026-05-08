package com.example.sportsregistration.controller;

import com.example.sportsregistration.Mapper.RegistrationMapper;
import com.example.sportsregistration.dto.RegistrationDTO;
import com.example.sportsregistration.entity.Registration;
import com.example.sportsregistration.Mapper.RegistrationMapper;
import com.example.sportsregistration.service.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {

    private final RegistrationService service;

    public RegistrationController(@Valid @RequestBody RegistrationService service) {
        this.service = service;
    }

    // CREATE Registration (DTO → Entity → DTO)
    @PostMapping
    public ResponseEntity<RegistrationDTO> createRegistration(
            @Validated @RequestBody RegistrationDTO dto) {

        Registration registration = RegistrationMapper.toEntity(dto);
        Registration saved = service.saveRegistration(registration);

        return ResponseEntity.ok(RegistrationMapper.toDTO(saved));
    }

    // GET by ID
    @GetMapping("/{id}")
    public ResponseEntity<RegistrationDTO> getRegistration(@PathVariable Long id) {
        Registration reg = service.getRegistrationById(id);

        if (reg == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(RegistrationMapper.toDTO(reg));
    }

    // GET all
    @GetMapping
    public ResponseEntity<List<Registration>> getAllRegistrations() {
        return ResponseEntity.ok(service.getAllRegistrations());
    }
}