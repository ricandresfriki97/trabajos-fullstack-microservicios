package com.InventoryService.InventoryServices.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryServiceEventRequestDTO {
    @NotBlank
    private String productName;
    @NotBlank
    private String productId;
}