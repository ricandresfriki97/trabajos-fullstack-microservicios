package com.InventoryService.InventoryServices.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryServiceEventReponseDTO {
    private String productId;
    private String productName;
}