package com.RentalService.RentalServices.service;

import com.RentalService.RentalServices.dto.RentalServiceBookingResponseDTO;
import com.RentalService.RentalServices.model.mapper.RentalServiceBookingMapper;
import com.RentalService.RentalServices.repository.RentalServiceBookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalServiceBookingServicelmpl implements RentalServiceBookingService {

    private final RentalServiceBookingRepository rentalServiceBookingRepository;
    private final RentalServiceBookingMapper rentalServiceBookingMapper;

    @Override
    public RentalServiceBookingResponseDTO getRentalServiceBookingById(Long bookingId) {
        return rentalServiceBookingRepository.findById(bookingId)
                .map(rentalServiceBookingMapper::toRentalServiceBookingResponseDTO)
                .orElseThrow(() -> new RuntimeException("Rental Service Booking not found"));
    }

    @Override
    public List<RentalServiceBookingResponseDTO> getAllRentalServiceBookings() {
        return rentalServiceBookingMapper.toRentalServiceBookingResponseDTOs(rentalServiceBookingRepository.findAll());
    }

    @Override
    public RentalServiceBookingResponseDTO bookRentalService(Long rentalServiceId, Long userId, String startDate, String endDate) {
        return null;
    }
}
