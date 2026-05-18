package com.customerservice.service;

import com.customerservice.dto.CustomerServiceRequestDTO;
import com.customerservice.dto.CustomerServiceResponseDTO;
import com.customerservice.model.CustomerService;
import com.customerservice.repository.CustomerServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceServiceImpl implements CustomerServiceService {
    
    private final CustomerServiceRepository repository;

    @Override
    public CustomerServiceResponseDTO getCustomerServiceById(Long id) {
        CustomerService service = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer Service not found with id: " + id));
        return mapToResponseDTO(service);
    }

    @Override
    public List<CustomerServiceResponseDTO> getAllCustomerServices() {
        return repository.findAll()
                .stream()
                .map(this::mapToResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerServiceResponseDTO createCustomerService(CustomerServiceRequestDTO dto) {
        CustomerService service = new CustomerService();
        service.setName(dto.getName());
        service.setDescription(dto.getDescription());
        service.setCreatedAt(new Date());
        service.setUpdatedAt(new Date());
        
        CustomerService saved = repository.save(service);
        return mapToResponseDTO(saved);
    }

    @Override
    public CustomerServiceResponseDTO updateCustomerService(Long id, CustomerServiceRequestDTO dto) {
        CustomerService service = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer Service not found with id: " + id));
        
        service.setName(dto.getName());
        service.setDescription(dto.getDescription());
        service.setUpdatedAt(new Date());
        
        CustomerService updated = repository.save(service);
        return mapToResponseDTO(updated);
    }

    @Override
    public void deleteCustomerService(Long id) {
        repository.deleteById(id);
    }

    private CustomerServiceResponseDTO mapToResponseDTO(CustomerService service) {
        CustomerServiceResponseDTO dto = new CustomerServiceResponseDTO();
        dto.setId(service.getId());
        dto.setName(service.getName());
        dto.setDescription(service.getDescription());
        return dto;
    }
}

