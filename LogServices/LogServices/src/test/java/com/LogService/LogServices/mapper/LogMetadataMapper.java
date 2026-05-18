package com.LogService.LogServices.mapper;
import com.LogService.LogServices.dto.LogMetadataRequestDTO;
import com.LogService.LogServices.dto.LogMetadataResponseDTO;
import com.LogService.LogServices.model.LogMetadata;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface LogMetadataMapper {
    LogMetadataMapper INSTANCE = Mappers.getMapper(LogMetadataMapper.class);

    LogMetadata toLogMetadata(LogMetadataRequestDTO logMetadataRequestDTO);

    @Mapping(source = "timestamp", target = "timestamp", dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    LogMetadataResponseDTO toLogMetadataResponseDTO(LogMetadata logMetadata);

    List<LogMetadataResponseDTO> toLogMetadataResponseDTOList(List<LogMetadata> logMetadataList);
}