package com.RecommendationService.RecommendationServices.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecommendationServiceReponseDTO {
    private Long userId;
    private String recommendedItems;
    private String recommendationReason;
}

