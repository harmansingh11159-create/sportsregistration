package com.example.sportsregistration.dto;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class RegistrationDTO {

    // Getters and Setters
    private String name;

    private String fathersName;

    private String aadhaarCardNo;

    private String paymentId;

    private String category;   // Under10, Under20, etc.

    private Integer age;

    private String gender;

    private String sportsEvent;

    private String address;

    private String state;

    private String district;

    private String country;

}
