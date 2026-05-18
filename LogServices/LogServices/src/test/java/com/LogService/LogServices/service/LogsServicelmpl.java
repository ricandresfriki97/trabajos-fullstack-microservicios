package com.LogService.LogServices.service;
import com.LogService.LogServices.dto.LogsRequestDTO;
import com.LogService.LogServices.dto.LogsResponseDTO;
import com.LogService.LogServices.mapper.LogsMapper;
import com.LogService.LogServices.repository.LogsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LogsServicelmpl implements LogsService {
    private final LogsRepository logsRepository;
    private final LogsMapper logsMapper;

    @Override
    public LogsResponseDTO createLog(LogsRequestDTO logsRequestDTO) {
        var log = logsMapper.toLog(logsRequestDTO);
        var savedLog = logsRepository.save(log);
        return logsMapper.toLogsResponseDTO(savedLog);
    }

    @Override
    public List<LogsResponseDTO> getAllLogs() {
        var logs = logsRepository.findAll();
        return logsMapper.toLogsResponseDTOList(logs);
    }

    @Override
    public LogsResponseDTO getLogsById(Long id) {
        var log = logsRepository.findById(id).orElse(null);
        return log != null ? logsMapper.toLogsResponseDTO(log) : null;
    }
}
