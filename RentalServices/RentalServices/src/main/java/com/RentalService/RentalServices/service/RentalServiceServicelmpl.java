package com.RentalService.RentalServices.service;

import com.RentalService.RentalServices.dto.RentalServiceRequestDTO;
import com.RentalService.RentalServices.dto.RentalServiceResponseDTO;
import com.RentalService.RentalServices.model.mapper.RentalServiceMapper;
import com.RentalService.RentalServices.repository.RentalServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalServiceServicelmpl implements RentalServiceService {

    private final RentalServiceRepository rentalServiceRepository;
    private final RentalServiceMapper rentalServiceMapper;

    @Override
    public RentalServiceResponseDTO getRentalServiceById(Long rentalServiceId) {
        return rentalServiceRepository.findById(rentalServiceId)
                .map(rentalServiceMapper::toRentalServiceResponseDTO)
                .orElseThrow(() -> new RuntimeException("Rental Service not found"));
    }

    @Override
    public List<RentalServiceResponseDTO> getAllRentalServices() {
        return rentalServiceMapper.toRentalServiceResponseDTOs(rentalServiceRepository.findAll());
    }
}