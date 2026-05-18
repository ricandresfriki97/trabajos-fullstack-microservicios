package com.RecommendationService.RecommendationServices.controller;

import com.RecommendationService.RecommendationServices.dto.RecommendationServiceReponseDTO;
import com.RecommendationService.RecommendationServices.service.RecommendationServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/recommendations")
public class RecommendationServiceController {

    private final RecommendationServiceService recommendationServiceService;

    @GetMapping("/{userId}")
    public ResponseEntity<List<RecommendationServiceReponseDTO>> getRecommendations(@PathVariable Long userId) {
        List<RecommendationServiceReponseDTO> recommendations = recommendationServiceService.getRecommendationsForUser(userId);
        return ResponseEntity.ok(recommendations);
    }
}

