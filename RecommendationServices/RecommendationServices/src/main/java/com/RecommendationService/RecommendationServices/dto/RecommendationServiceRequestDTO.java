package com.RecommendationService.RecommendationServices.dto;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecommendationServiceRequestDTO {
    @NotNull(message = "User ID cannot be null")
    private Long userId;

    @NotBlank(message = "User preferences cannot be blank")
    private String userPreferences;

    @NotNull(message = "Request timestamp cannot be null")
    private Date requestTimestamp;

    private String title;
    private String description;
}

