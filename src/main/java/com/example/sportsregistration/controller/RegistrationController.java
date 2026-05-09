package com.example.sportsregistration.controller;

import com.example.sportsregistration.mapper.RegistrationMapper;
import com.example.sportsregistration.dto.RegistrationDTO;
import com.example.sportsregistration.entity.Registration;
import com.example.sportsregistration.service.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {

    private final RegistrationService service;
    private final RegistrationMapper mapper;

    // Constructor injection
    public RegistrationController(RegistrationService service, RegistrationMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    // CREATE Registration (DTO → Entity → DTO)
    @PostMapping
    public ResponseEntity<RegistrationDTO> createRegistration(@Valid @RequestBody RegistrationDTO dto) {
        Registration registration = mapper.toEntity(dto);
        Registration saved = service.saveRegistration(registration);
        return ResponseEntity.ok(mapper.toDTO(saved));
    }

    // GET by ID (String for MongoDB)
    @GetMapping("/{id}")
    public ResponseEntity<RegistrationDTO> getRegistration(@PathVariable String id) {
        Registration reg = service.getRegistrationById(id);

        if (reg == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(mapper.toDTO(reg));
    }

    // GET all
    @GetMapping
    public ResponseEntity<List<Registration>> getAllRegistrations() {
        return ResponseEntity.ok(service.getAllRegistrations());
    }
}
