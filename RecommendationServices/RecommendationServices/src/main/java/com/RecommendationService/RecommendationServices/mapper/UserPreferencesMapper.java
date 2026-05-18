package com.RecommendationService.RecommendationServices.mapper;

import com.RecommendationService.RecommendationServices.dto.UserPreferencesRequestDTO;
import com.RecommendationService.RecommendationServices.dto.UserPreferencesReponseDTO;
import com.RecommendationService.RecommendationServices.model.UserPreferences;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UserPreferencesMapper {
    UserPreferencesMapper INSTANCE = Mappers.getMapper(UserPreferencesMapper.class);

    UserPreferences toEntity(UserPreferencesRequestDTO requestDTO);

    UserPreferencesReponseDTO toResponseDTO(UserPreferences userPreferences);

    List<UserPreferencesReponseDTO> toResponseDTOs(List<UserPreferences> userPreferences);
}

