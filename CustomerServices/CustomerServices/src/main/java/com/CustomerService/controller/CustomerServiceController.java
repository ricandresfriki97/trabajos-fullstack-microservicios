package com.customerservice.controller;

import com.customerservice.dto.CustomerServiceRequestDTO;
import com.customerservice.dto.CustomerServiceResponseDTO;
import com.customerservice.service.CustomerServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer-services")
@RequiredArgsConstructor
public class CustomerServiceController {
    
    private final CustomerServiceService service;

    @GetMapping("/{id}")
    public ResponseEntity<CustomerServiceResponseDTO> getCustomerServiceById(@PathVariable Long id) {
        CustomerServiceResponseDTO response = service.getCustomerServiceById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<CustomerServiceResponseDTO>> getAllCustomerServices() {
        List<CustomerServiceResponseDTO> response = service.getAllCustomerServices();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<CustomerServiceResponseDTO> createCustomerService(
            @RequestBody CustomerServiceRequestDTO requestDTO) {
        CustomerServiceResponseDTO response = service.createCustomerService(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerServiceResponseDTO> updateCustomerService(
            @PathVariable Long id,
            @RequestBody CustomerServiceRequestDTO requestDTO) {
        CustomerServiceResponseDTO response = service.updateCustomerService(id, requestDTO);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomerService(@PathVariable Long id) {
        service.deleteCustomerService(id);
        return ResponseEntity.noContent().build();
    }
}

