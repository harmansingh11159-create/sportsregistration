package com.example.sportsregistration.Mapper;

import com.example.sportsregistration.dto.RegistrationDTO;
import com.example.sportsregistration.entity.Registration;

public class RegistrationMapper {

    public static Registration toEntity(RegistrationDTO dto) {

        Registration reg = new Registration();

        reg.setName(dto.getName());
        reg.setFathersName(dto.getFathersName());
        reg.setAadhaarCardNo(dto.getAadhaarCardNo());
        reg.setPaymentId(dto.getPaymentId());
        reg.setCategory(dto.getCategory());
        reg.setAge(dto.getAge());
        reg.setGender(dto.getGender());
        reg.setSportsEvent(dto.getSportsEvent());
        reg.setAddress(dto.getAddress());
        reg.setState(dto.getState());
        reg.setDistrict(dto.getDistrict());
        reg.setCountry(dto.getCountry());

        return reg;
    }

    public static RegistrationDTO toDTO(Registration saved) {

        RegistrationDTO dto = new RegistrationDTO();

        dto.setName(saved.getName());
        dto.setFathersName(saved.getFathersName());
        dto.setAadhaarCardNo(saved.getAadhaarCardNo());
        dto.setPaymentId(saved.getPaymentId());
        dto.setCategory(saved.getCategory());
        dto.setAge(saved.getAge());
        dto.setGender(saved.getGender());
        dto.setSportsEvent(saved.getSportsEvent());
        dto.setAddress(saved.getAddress());
        dto.setState(saved.getState());
        dto.setDistrict(saved.getDistrict());
        dto.setCountry(saved.getCountry());

        return dto;
    }
}