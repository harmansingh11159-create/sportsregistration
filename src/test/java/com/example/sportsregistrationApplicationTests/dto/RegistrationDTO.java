package com.example.sportsregistrationApplicationTests.dto;

import jakarta.validation.constraints.*;
import jakarta.validation.constraints.Pattern;

public class RegistrationDTO {

    private String name;

    private String fathersName;

    @Pattern(regexp = "\\d{12}", message = "Aadhaar must be 12 digits")
    private String aadhaarCardNo;

    private String paymentId;

    private String category;   // e.g. Under10, Under20, etc.

    @Min(value = 5, message = "Age must be at least 5")
    @Max(value = 100, message = "Age must be realistic")
    private Integer age;

    private String gender;

    private String sportsEvent;

    private String address;

    private String state;

    private String district;

    private String country;

    // Getters and Setters
    // ...
}
