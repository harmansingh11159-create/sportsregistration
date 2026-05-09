package com.example.sportsregistrationApplicationTests.dto;

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
    private String category;
    private Integer age;
    private String gender;
    private String sportsEvent;
    private String address;
    private String state;
    private String district;
    private String country;

    public RegistrationDTO() {}

}
