package com.LogService.LogServices.dto;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogsRequestDTO {
    @NotNull(message = "Timestamp cannot be null")
    private Date timestamp;

    @NotBlank(message = "Log level cannot be blank")
    private String logLevel;

    @NotBlank(message = "Message cannot be blank")
    private String message;

    private String source;
}
