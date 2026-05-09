package com.example.sportsregistration.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "registrations")
public class Registration {

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

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getFathersName() { return fathersName; }
    public void setFathersName(String fathersName) { this.fathersName = fathersName; }

    public String getAadhaarCardNo() { return aadhaarCardNo; }
    public void setAadhaarCardNo(String aadhaarCardNo) { this.aadhaarCardNo = aadhaarCardNo; }

    public String getPaymentId() { return paymentId; }
    public void setPaymentId(String paymentId) { this.paymentId = paymentId; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getSportsEvent() { return sportsEvent; }
    public void setSportsEvent(String sportsEvent) { this.sportsEvent = sportsEvent; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
}
