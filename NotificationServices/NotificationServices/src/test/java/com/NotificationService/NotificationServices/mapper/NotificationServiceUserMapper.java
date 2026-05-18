package com.NotificationService.NotificationServices.mapper;
import com.NotificationService.NotificationServices.dto.NotificationServiceUserRequestDTO;
import com.NotificationService.NotificationServices.dto.NotificationServiceUserResponseDTO;
import com.NotificationService.NotificationServices.model.NotificationService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface NotificationServiceUserMapper {
    NotificationServiceUserMapper INSTANCE = Mappers.getMapper(NotificationServiceUserMapper.class);
    @Mapping(source = "userId", target = "userId")
    NotificationService toEntity(NotificationServiceUserRequestDTO dto);
    @Mapping(source = "userId", target = "userId")
    NotificationServiceUserResponseDTO toDTO(NotificationService entity);
    List<NotificationServiceUserResponseDTO> toDTOList(List<NotificationService> entities);
}