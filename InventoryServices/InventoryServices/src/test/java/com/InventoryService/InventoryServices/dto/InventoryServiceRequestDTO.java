package com.InventoryService.InventoryServices.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryServiceRequestDTO{
    @NotNull
    @NotBlank
    private String productId;
    @NotNull
    @NotBlank
    private String productName;
}