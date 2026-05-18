package com.RecommendationService.RecommendationServices.service;

import com.RecommendationService.RecommendationServices.dto.RecommendationServiceReponseDTO;
import com.RecommendationService.RecommendationServices.dto.UserPreferencesReponseDTO;
import java.util.List;

public interface RecommendationServiceService {
    List<RecommendationServiceReponseDTO> getRecommendationsForUser(Long userId);
    List<RecommendationServiceReponseDTO> getAllRecommendations();
    RecommendationServiceReponseDTO getRecommendationById(Long id);
    RecommendationServiceReponseDTO createRecommendation(RecommendationServiceReponseDTO recommendationServiceRequestDTO, UserPreferencesReponseDTO userPreferences);
    RecommendationServiceReponseDTO updateRecommendation(Long id, RecommendationServiceReponseDTO recommendationServiceRequestDTO, UserPreferencesReponseDTO userPreferences);
    void deleteRecommendation(Long id);
}

