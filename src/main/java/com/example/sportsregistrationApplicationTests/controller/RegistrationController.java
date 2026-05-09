package com.example.sportsregistrationApplicationTests.controller;

import com.example.sportsregistrationApplicationTests.dto.RegistrationDTO;
import com.example.sportsregistrationApplicationTests.entity.Registration;
import com.example.sportsregistrationApplicationTests.Mapper.RegistrationMapper;
import com.example.sportsregistrationApplicationTests.service.RegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {

    private final RegistrationService service;
    private final RegistrationMapper mapper;

    public RegistrationController(RegistrationService service, RegistrationMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    // Create a new registration
    @PostMapping
    public ResponseEntity<RegistrationDTO> createRegistration(@Valid @RequestBody RegistrationDTO dto) {
        Registration registration = mapper.toEntity(dto);
        Registration saved = service.saveRegistration(registration);
        return ResponseEntity.ok(mapper.toDTO(saved));
    }

    // Get registration by ID
    @GetMapping("/{id}")
    public ResponseEntity<RegistrationDTO> getRegistration(@PathVariable Long id) {
        Registration reg = service.getRegistrationById(String.valueOf(id));
        if (reg == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(mapper.toDTO(reg));
    }

    // Get all registrations
    @GetMapping
    public List<RegistrationDTO> getAllRegistrations() {
        return service.getAllRegistrations()
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
}
