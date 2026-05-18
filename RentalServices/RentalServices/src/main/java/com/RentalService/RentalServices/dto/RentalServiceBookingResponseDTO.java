package com.RentalService.RentalServices.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalServiceBookingResponseDTO {

    private Long id;

    private Long rentalServiceId;

    private Long userId;

    private String startDate;

    private String endDate;

    private String status;
}