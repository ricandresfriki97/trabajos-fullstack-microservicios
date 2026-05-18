package com.RecommendationService.RecommendationServices.service;
import com.RecommendationService.RecommendationServices.dto.UserPreferencesRequestDTO;
import com.RecommendationService.RecommendationServices.dto.UserPreferencesReponseDTO;
import com.RecommendationService.RecommendationServices.mapper.UserPreferencesMapper;
import com.RecommendationService.RecommendationServices.repository.UserPreferencesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserPreferencesServicelmpl implements UserPreferencesService {
    private final UserPreferencesRepository userPreferencesRepository;
    private final UserPreferencesMapper userPreferencesMapper;

    @Override
    public UserPreferencesReponseDTO getUserPreferencesByUserId(Long userId) {
        // Mock implementation for testing
        return new UserPreferencesReponseDTO(userId, "Mock Preference 1, Mock Preference 2");
    }

    @Override
    public List<UserPreferencesReponseDTO> getAllUserPreferences() {
        // Mock implementation for testing
        return List.of(new UserPreferencesReponseDTO(1L, "Mock Preference 1, Mock Preference 2"));
    }

    @Override
    public UserPreferencesReponseDTO createUserPreferences(UserPreferencesRequestDTO userPreferencesRequestDTO) {
        // Mock implementation for testing
        return new UserPreferencesReponseDTO(userPreferencesRequestDTO.getUserId(), userPreferencesRequestDTO.getUserPreferences());
    }

    @Override
    public UserPreferencesReponseDTO updateUserPreferences(Long userId, UserPreferencesRequestDTO userPreferencesRequestDTO) {
        // Mock implementation for testing
        return new UserPreferencesReponseDTO(userId, userPreferencesRequestDTO.getUserPreferences());
    }

    @Override
    public void deleteUserPreferences(Long userId) {
        // Mock implementation for testing
    }
}

