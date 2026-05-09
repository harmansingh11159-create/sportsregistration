package com.example.sportsregistration.entity;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;



import jakarta.persistence.*;

@Entity
@Table(name = "registrations")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    public Registration() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getAadhaarCardNo() {
        return aadhaarCardNo;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getCategory() {
        return category;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getSportsEvent() {
        return sportsEvent;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getDistrict() {
        return district;
    }

    public String getCountry() {
        return country;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setAadhaarCardNo(String aadhaarCardNo) {
        this.aadhaarCardNo = aadhaarCardNo;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSportsEvent(String sportsEvent) {
        this.sportsEvent = sportsEvent;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}