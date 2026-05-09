package com.example.sportsregistrationApplicationTests.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "registrations")
public class Registration {

    // Getters and Setters
    @Id
    private String id;   // MongoDB ObjectId stored as String

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

    public Registration() {}

}
