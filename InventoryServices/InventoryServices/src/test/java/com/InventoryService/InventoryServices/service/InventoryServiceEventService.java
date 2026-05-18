package com.InventoryService.InventoryServices.service;
import com.InventoryService.InventoryServices.dto.InventoryServiceEventRequestDTO;
import com.InventoryService.InventoryServices.dto.InventoryServiceEventReponseDTO;
import java.util.List;


public interface InventoryServiceEventService {
    InventoryServiceEventReponseDTO createInventoryServiceEvent(InventoryServiceEventRequestDTO requestDTO);

    List<InventoryServiceEventReponseDTO> getAllInventoryServiceEvents();
}