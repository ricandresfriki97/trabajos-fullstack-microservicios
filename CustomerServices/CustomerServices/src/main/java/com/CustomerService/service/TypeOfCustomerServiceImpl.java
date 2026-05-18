package com.customerservice.service;

import com.customerservice.dto.TypeOfCustomerRequestDTO;
import com.customerservice.dto.TypeOfCustomerResponseDTO;
import com.customerservice.model.TypeOfCustomer;
import com.customerservice.repository.TypeOfCustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TypeOfCustomerServiceImpl implements TypeOfCustomerService {

    private final TypeOfCustomerRepository repository;

    @Override
    public TypeOfCustomerResponseDTO getTypeOfCustomerById(Long id) {
        TypeOfCustomer typeOfCustomer = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Type of Customer not found with id: " + id));
        return mapToResponseDTO(typeOfCustomer);
    }

    @Override
    public List<TypeOfCustomerResponseDTO> getAllTypeOfCustomers() {
        return repository.findAll()
                .stream()
                .map(this::mapToResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TypeOfCustomerResponseDTO createTypeOfCustomer(TypeOfCustomerRequestDTO dto) {
        TypeOfCustomer typeOfCustomer = new TypeOfCustomer();
        typeOfCustomer.setName(dto.getName());
        typeOfCustomer.setDescription(dto.getDescription());

        TypeOfCustomer saved = repository.save(typeOfCustomer);
        return mapToResponseDTO(saved);
    }

    @Override
    public TypeOfCustomerResponseDTO updateTypeOfCustomer(Long id, TypeOfCustomerRequestDTO dto) {
        TypeOfCustomer typeOfCustomer = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Type of Customer not found with id: " + id));

        typeOfCustomer.setName(dto.getName());
        typeOfCustomer.setDescription(dto.getDescription());

        TypeOfCustomer updated = repository.save(typeOfCustomer);
        return mapToResponseDTO(updated);
    }

    @Override
    public void deleteTypeOfCustomer(Long id) {
        repository.deleteById(id);
    }

    private TypeOfCustomerResponseDTO mapToResponseDTO(TypeOfCustomer typeOfCustomer) {
        TypeOfCustomerResponseDTO dto = new TypeOfCustomerResponseDTO();
        dto.setId(typeOfCustomer.getId());
        dto.setName(typeOfCustomer.getName());
        dto.setDescription(typeOfCustomer.getDescription());
        return dto;
    }
}

