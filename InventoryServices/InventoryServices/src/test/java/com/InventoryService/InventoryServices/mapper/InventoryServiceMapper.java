package com.InventoryService.InventoryServices.mapper;
import com.InventoryService.InventoryServices.dto.InventoryServiceEventRequestDTO;
import com.InventoryService.InventoryServices.dto.InventoryServiceEventReponseDTO;
import com.InventoryService.InventoryServices.dto.InventoryServiceRequestDTO;
import com.InventoryService.InventoryServices.dto.InventoryServiceReponseDTO;
import com.InventoryService.InventoryServices.model.InventoryService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;


@Mapper(componentModel = "spring")
public interface InventoryServiceMapper {
    InventoryServiceMapper INSTANCE = Mappers.getMapper(InventoryServiceMapper.class);

    InventoryService toEntity(InventoryServiceRequestDTO dto);

    InventoryServiceReponseDTO toDTO(InventoryService inventoryService);

    List<InventoryServiceReponseDTO> toDTOList(List<InventoryService> inventoryServices);
}