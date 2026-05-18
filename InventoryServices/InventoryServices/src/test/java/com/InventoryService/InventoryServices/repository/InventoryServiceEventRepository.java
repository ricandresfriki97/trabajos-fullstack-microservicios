package com.InventoryService.InventoryServices.repository;
import com.InventoryService.InventoryServices.model.InventoryServiceEvent;
import org.springframework.data.jpa.repository.JpaRepository;
public interface InventoryServiceEventRepository extends JpaRepository<InventoryServiceEvent, Integer>
{
}