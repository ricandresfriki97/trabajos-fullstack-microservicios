package com.RentalService.RentalServices.controller;

import com.RentalService.RentalServices.dto.RentalServiceResponseDTO;
import com.RentalService.RentalServices.service.RentalServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1/rental-services")
@RequiredArgsConstructor
public class RentalServiceController {

    private final RentalServiceService rentalServiceService;

    @GetMapping("/{rentalServiceId}")
    public ResponseEntity<RentalServiceResponseDTO> getRentalServiceById(@PathVariable Long rentalServiceId) {
        RentalServiceResponseDTO rentalService = rentalServiceService.getRentalServiceById(rentalServiceId);
        return ResponseEntity.ok(rentalService);
    }

    @GetMapping
    public ResponseEntity<List<RentalServiceResponseDTO>> getAllRentalServices() {
        List<RentalServiceResponseDTO> rentalServices = rentalServiceService.getAllRentalServices();
        return ResponseEntity.ok(rentalServices);
    }
}