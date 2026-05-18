package com.RentalService.RentalServices.model.mapper;
import com.RentalService.RentalServices.dto.RentalServiceBookingRequestDTO;
import com.RentalService.RentalServices.dto.RentalServiceBookingResponseDTO;
import com.RentalService.RentalServices.model.RentalServiceBooking;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class RentalServiceBookingMapper {
    public RentalServiceBookingResponseDTO toRentalServiceBookingResponseDTO(RentalServiceBooking rentalServiceBooking) {
        if (rentalServiceBooking == null) {
            return null;
        }
        RentalServiceBookingResponseDTO dto = new RentalServiceBookingResponseDTO();
        dto.setId(rentalServiceBooking.getId());
        dto.setRentalServiceId(rentalServiceBooking.getRentalServiceId());
        dto.setUserId(rentalServiceBooking.getUserId());
        dto.setStartDate(rentalServiceBooking.getStartDate());
        dto.setEndDate(rentalServiceBooking.getEndDate());
        dto.setStatus(rentalServiceBooking.getStatus());
        return dto;
    }
    public List<RentalServiceBookingResponseDTO> toRentalServiceBookingResponseDTOs(List<RentalServiceBooking> rentalServiceBookings) {
        return rentalServiceBookings.stream()
                .map(this::toRentalServiceBookingResponseDTO)
                .collect(Collectors.toList());
    }
    public RentalServiceBooking toRentalServiceBooking(RentalServiceBookingRequestDTO rentalServiceBookingRequestDTO) {
        if (rentalServiceBookingRequestDTO == null) {
            return null;
        }
        RentalServiceBooking rentalServiceBooking = new RentalServiceBooking();
        rentalServiceBooking.setRentalServiceId(rentalServiceBookingRequestDTO.getRentalServiceId());
        rentalServiceBooking.setUserId(rentalServiceBookingRequestDTO.getUserId());
        rentalServiceBooking.setStartDate(rentalServiceBookingRequestDTO.getStartDate().toString());
        rentalServiceBooking.setEndDate(rentalServiceBookingRequestDTO.getEndDate().toString());
        rentalServiceBooking.setStatus(rentalServiceBookingRequestDTO.getStatus());
        return rentalServiceBooking;
    }
}
