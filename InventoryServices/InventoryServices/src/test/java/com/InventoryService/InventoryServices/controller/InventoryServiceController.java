package com.InventoryService.InventoryServices.controller;

import com.InventoryService.InventoryServices.dto.InventoryServiceReponseDTO;
import com.InventoryService.InventoryServices.service.InventoryServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/InventoryServices")
@RequiredArgsConstructor
public class InventoryServiceController {
    private final InventoryServiceService inventoryServiceService;

    @GetMapping("/{productId}")
    public ResponseEntity<InventoryServiceReponseDTO> getInventoryByProductId(@PathVariable Long productId) {
        InventoryServiceReponseDTO response = inventoryServiceService.getAllInventoryServices().get(0);
        return ResponseEntity.ok(response);
    }
}
