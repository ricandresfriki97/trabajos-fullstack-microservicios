package com.customerservice.service;

import com.customerservice.dto.TypeOfCustomerRequestDTO;
import com.customerservice.dto.TypeOfCustomerResponseDTO;

import java.util.List;

public interface TypeOfCustomerService {
    TypeOfCustomerResponseDTO getTypeOfCustomerById(Long id);
    List<TypeOfCustomerResponseDTO> getAllTypeOfCustomers();
    TypeOfCustomerResponseDTO createTypeOfCustomer(TypeOfCustomerRequestDTO dto);
    TypeOfCustomerResponseDTO updateTypeOfCustomer(Long id, TypeOfCustomerRequestDTO dto);
    void deleteTypeOfCustomer(Long id);
}

