package com.NotificationService.NotificationServices.mapper;

import com.NotificationService.NotificationServices.dto.NotificationServiceRequestDTO;
import com.NotificationService.NotificationServices.dto.NotificationServiceResponseDTO;
import com.NotificationService.NotificationServices.dto.NotificationServiceUserRequestDTO;
import com.NotificationService.NotificationServices.model.NotificationService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring", uses = {NotificationServiceUserMapper.class})
public interface NotificationServiceMapper {
    NotificationServiceMapper INSTANCE = mappers.getMapper(NotificationServiceMapper.class);
    NotificationService toEntity(NotificationServiceRequestDTO dto);
    NotificationServiceResponseDTO toDTO(NotificationService entity);
    List<NotificationServiceResponseDTO> toDTOList(List<NotificationService> entities);
}