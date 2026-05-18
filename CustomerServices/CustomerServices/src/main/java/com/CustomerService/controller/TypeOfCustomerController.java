package com.customerservice.controller;

import com.customerservice.dto.TypeOfCustomerRequestDTO;
import com.customerservice.dto.TypeOfCustomerResponseDTO;
import com.customerservice.service.TypeOfCustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/type-of-customers")
@RequiredArgsConstructor
public class TypeOfCustomerController {

    private final TypeOfCustomerService service;

    @GetMapping("/{id}")
    public ResponseEntity<TypeOfCustomerResponseDTO> getTypeOfCustomerById(@PathVariable Long id) {
        TypeOfCustomerResponseDTO response = service.getTypeOfCustomerById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<TypeOfCustomerResponseDTO>> getAllTypeOfCustomers() {
        List<TypeOfCustomerResponseDTO> response = service.getAllTypeOfCustomers();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<TypeOfCustomerResponseDTO> createTypeOfCustomer(
            @RequestBody TypeOfCustomerRequestDTO requestDTO) {
        TypeOfCustomerResponseDTO response = service.createTypeOfCustomer(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TypeOfCustomerResponseDTO> updateTypeOfCustomer(
            @PathVariable Long id,
            @RequestBody TypeOfCustomerRequestDTO requestDTO) {
        TypeOfCustomerResponseDTO response = service.updateTypeOfCustomer(id, requestDTO);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTypeOfCustomer(@PathVariable Long id) {
        service.deleteTypeOfCustomer(id);
        return ResponseEntity.noContent().build();
    }
}

