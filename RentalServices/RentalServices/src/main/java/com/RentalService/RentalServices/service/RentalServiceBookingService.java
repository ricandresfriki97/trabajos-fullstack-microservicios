package com.RentalService.RentalServices.service;

import com.RentalService.RentalServices.dto.RentalServiceBookingResponseDTO;
import java.util.List;

public interface RentalServiceBookingService {

    RentalServiceBookingResponseDTO getRentalServiceBookingById(Long bookingId);

    List<RentalServiceBookingResponseDTO> getAllRentalServiceBookings();

    RentalServiceBookingResponseDTO bookRentalService(Long rentalServiceId, Long userId, String startDate, String endDate);
}