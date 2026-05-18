package com.RecommendationService.RecommendationServices.repository;
import com.RecommendationService.RecommendationServices.model.UserPreferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPreferencesRepository extends JpaRepository<UserPreferences, Long> {
}

