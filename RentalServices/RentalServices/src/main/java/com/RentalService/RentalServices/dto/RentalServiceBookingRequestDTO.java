package com.RentalService.RentalServices.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalServiceBookingRequestDTO {

    private Long id;

    @NotNull(message = "Rental service ID cannot be null")
    private Long rentalServiceId;

    @NotNull(message = "User ID cannot be null")
    private Long userId;

    @NotNull(message = "Start date cannot be null")
    private Date startDate;

    @NotNull(message = "End date cannot be null")
    private Date endDate;

    @NotBlank(message = "Status cannot be blank")
    private String status;
}