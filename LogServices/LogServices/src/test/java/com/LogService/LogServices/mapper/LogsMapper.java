package com.LogService.LogServices.mapper;

import com.LogService.LogServices.dto.LogsRequestDTO;
import com.LogService.LogServices.dto.LogsResponseDTO;
import com.LogService.LogServices.model.Logs;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring", uses = {LogMetadataMapper.class})
public interface LogsMapper {
    LogsMapper INSTANCE = Mappers.getMapper(LogsMapper.class);

    Logs toLog(LogsRequestDTO logsRequestDTO);

    LogsResponseDTO toLogsResponseDTO(Logs logs);

    List<LogsResponseDTO> toLogsResponseDTOList(List<Logs> logs);
}