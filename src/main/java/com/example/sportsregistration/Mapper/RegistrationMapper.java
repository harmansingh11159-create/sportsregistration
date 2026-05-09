package com.example.sportsregistration.mapper;

import com.example.sportsregistration.dto.RegistrationDTO;
import com.example.sportsregistration.entity.Registration;
import org.springframework.stereotype.Component;

@Component
public class RegistrationMapper {

    // DTO → Entity
    public Registration toEntity(RegistrationDTO dto) {
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

    // Entity → DTO
    public RegistrationDTO toDTO(Registration reg) {
        RegistrationDTO dto = new RegistrationDTO();
        dto.setName(reg.getName());
        dto.setFathersName(reg.getFathersName());
        dto.setAadhaarCardNo(reg.getAadhaarCardNo());
        dto.setPaymentId(reg.getPaymentId());
        dto.setCategory(reg.getCategory());
        dto.setAge(reg.getAge());
        dto.setGender(reg.getGender());
        dto.setSportsEvent(reg.getSportsEvent());
        dto.setAddress(reg.getAddress());
        dto.setState(reg.getState());
        dto.setDistrict(reg.getDistrict());
        dto.setCountry(reg.getCountry());
        return dto;
    }
}
