package com.LogService.LogServices.service;

import com.LogService.LogServices.dto.LogsRequestDTO;
import com.LogService.LogServices.dto.LogsResponseDTO;
import java.util.List;

public interface LogsService {
    LogsResponseDTO createLog(LogsRequestDTO logsRequestDTO);
    List<LogsResponseDTO> getAllLogs();
    LogsResponseDTO getLogsById(Long id);
}