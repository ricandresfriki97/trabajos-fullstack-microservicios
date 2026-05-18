package com.RecommendationService.RecommendationServices.mapper;

import com.RecommendationService.RecommendationServices.dto.RecommendationServiceReponseDTO;
import com.RecommendationService.RecommendationServices.dto.RecommendationServiceRequestDTO;
import com.RecommendationService.RecommendationServices.model.RecommendationService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface RecommendationServiceMapper {
    RecommendationServiceMapper INSTANCE = Mappers.getMapper(RecommendationServiceMapper.class);

    RecommendationServiceReponseDTO toResponseDTO(RecommendationService recommendationService);

    List<RecommendationServiceReponseDTO> toResponseDTOs(List<RecommendationService> recommendationServices);

    RecommendationService toEntity(RecommendationServiceRequestDTO requestDTO);
}

