package com.LogService.LogServices.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogMetadataRequestDTO {
    @NotNull(message = "Timestamp cannot be null")
    private String timestamp;

    @NotBlank(message = "Log level cannot be blank")
    private String logLevel;

    @NotBlank(message = "Message cannot be blank")
    private String message;

    private String source;
}
