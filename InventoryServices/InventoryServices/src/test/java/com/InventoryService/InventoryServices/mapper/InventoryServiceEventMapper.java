package com.InventoryService.InventoryServices.mapper;
import com.InventoryService.InventoryServices.dto.InventoryServiceEventRequestDTO;
import com.InventoryService.InventoryServices.dto.InventoryServiceEventReponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import java.util.List;
@Mapper(componentModel = "spring")
public interface InventoryServiceEventMapper {
    InventoryServiceEventMapper INSTANCE = Mappers.getMapper(InventoryServiceEventMapper.class);

    @Mapping(source = "productId", target = "productId")
    @Mapping(source = "productName", target = "productName")
    InventoryServiceEventReponseDTO toResponseDTO(InventoryServiceEventRequestDTO requestDTO);

    List<InventoryServiceEventReponseDTO> toResponseDTOList(List<InventoryServiceEventRequestDTO> requestDTOs);
}