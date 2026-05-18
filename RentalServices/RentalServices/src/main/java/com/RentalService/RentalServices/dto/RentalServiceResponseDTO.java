package com.RentalService.RentalServices.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalServiceResponseDTO {

    private Long id;

    private String name;

    private String description;

    private Double pricePerDay;
}