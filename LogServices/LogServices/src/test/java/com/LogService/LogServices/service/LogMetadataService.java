package com.LogService.LogServices.service;
import com.LogService.LogServices.dto.LogMetadataRequestDTO;
import com.LogService.LogServices.dto.LogMetadataResponseDTO;
import java.util.List;
public interface LogMetadataService {
    LogMetadataResponseDTO createLogMetadata(LogMetadataRequestDTO logMetadataRequestDTO);
    List<LogMetadataResponseDTO> getAllLogMetadata();
}