package com.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeOfCustomerResponseDTO {
    private Long id;
    private String name;
    private String description;
}

