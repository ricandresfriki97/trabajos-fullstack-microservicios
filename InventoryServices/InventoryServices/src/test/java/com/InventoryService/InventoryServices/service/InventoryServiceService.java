package com.InventoryService.InventoryServices.service;
import com.InventoryService.InventoryServices.dto.InventoryServiceRequestDTO;
import com.InventoryService.InventoryServices.dto.InventoryServiceReponseDTO;
import java.util.List;
public interface InventoryServiceService {
    InventoryServiceReponseDTO createInventoryService(InventoryServiceRequestDTO requestDTO);

    List<InventoryServiceReponseDTO> getAllInventoryServices();
}