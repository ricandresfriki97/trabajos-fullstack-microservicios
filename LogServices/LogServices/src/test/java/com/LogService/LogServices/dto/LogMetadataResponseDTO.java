package com.LogService.LogServices.dto;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogMetadataResponseDTO {
    private String timestamp;
    private String logLevel;
    private String message;
    private String source;
}
