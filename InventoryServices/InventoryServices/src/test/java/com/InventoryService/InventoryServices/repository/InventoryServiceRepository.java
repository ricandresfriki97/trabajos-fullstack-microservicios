package com.InventoryService.InventoryServices.repository;
import com.InventoryService.InventoryServices.model.InventoryServiceEvent;
import org.springframework.data.jpa.repository.JpaRepository;
public interface InventoryServiceRepository extends JpaRepository<InventoryServiceEvent, Integer>{
}