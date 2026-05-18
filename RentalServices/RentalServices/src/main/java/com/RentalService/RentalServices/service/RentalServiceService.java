package com.RentalService.RentalServices.service;

import com.RentalService.RentalServices.dto.RentalServiceResponseDTO;
import java.util.List;

public interface RentalServiceService {

    RentalServiceResponseDTO getRentalServiceById(Long rentalServiceId);

    List<RentalServiceResponseDTO> getAllRentalServices();
}