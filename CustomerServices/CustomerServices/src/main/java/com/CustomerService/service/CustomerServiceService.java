package com.customerservice.service;

import com.customerservice.dto.CustomerServiceRequestDTO;
import com.customerservice.dto.CustomerServiceResponseDTO;

import java.util.List;

public interface CustomerServiceService {
    CustomerServiceResponseDTO getCustomerServiceById(Long id);
    List<CustomerServiceResponseDTO> getAllCustomerServices();
    CustomerServiceResponseDTO createCustomerService(CustomerServiceRequestDTO dto);
    CustomerServiceResponseDTO updateCustomerService(Long id, CustomerServiceRequestDTO dto);
    void deleteCustomerService(Long id);
}

