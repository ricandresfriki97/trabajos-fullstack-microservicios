package com.RecommendationService.RecommendationServices.service;

import com.RecommendationService.RecommendationServices.dto.UserPreferencesRequestDTO;
import com.RecommendationService.RecommendationServices.dto.UserPreferencesReponseDTO;
import java.util.List;

public interface UserPreferencesService {
    UserPreferencesReponseDTO getUserPreferencesByUserId(Long userId);
    List<UserPreferencesReponseDTO> getAllUserPreferences();
    UserPreferencesReponseDTO createUserPreferences(UserPreferencesRequestDTO userPreferencesRequestDTO);
    UserPreferencesReponseDTO updateUserPreferences(Long userId, UserPreferencesRequestDTO userPreferencesRequestDTO);
    void deleteUserPreferences(Long userId);
}

