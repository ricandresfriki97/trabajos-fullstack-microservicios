package com.RecommendationService.RecommendationServices.repository;
import com.RecommendationService.RecommendationServices.model.RecommendationService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendationServiceRepository extends JpaRepository<RecommendationService, Long> {
}

