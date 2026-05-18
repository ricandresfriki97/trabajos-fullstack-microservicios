package com.RecommendationService.RecommendationServices.dto;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPreferencesReponseDTO {
    private Long userId;
    private String userPreferences;
}

