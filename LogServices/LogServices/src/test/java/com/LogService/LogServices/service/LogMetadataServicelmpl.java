package com.LogService.LogServices.service;
import com.LogService.LogServices.dto.LogMetadataRequestDTO;
import com.LogService.LogServices.dto.LogMetadataResponseDTO;
import com.LogService.LogServices.mapper.LogMetadataMapper;
import com.LogService.LogServices.repository.LogMetadataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class LogMetadataServicelmpl implements LogMetadataService {
    private final LogMetadataRepository logMetadataRepository;
    private final LogMetadataMapper logMetadataMapper;
    @Override
    public LogMetadataResponseDTO createLogMetadata(LogMetadataRequestDTO logMetadataRequestDTO) {
        var logMetadata = logMetadataMapper.toLogMetadata(logMetadataRequestDTO);
        var savedLogMetadata = logMetadataRepository.save(logMetadata);
        return logMetadataMapper.toLogMetadataResponseDTO(savedLogMetadata);
    }
    @Override
    public List<LogMetadataResponseDTO> getAllLogMetadata() {
        var logMetadatas = logMetadataRepository.findAll();
        return logMetadataMapper.toLogMetadataResponseDTOList(logMetadatas);
    }
}
