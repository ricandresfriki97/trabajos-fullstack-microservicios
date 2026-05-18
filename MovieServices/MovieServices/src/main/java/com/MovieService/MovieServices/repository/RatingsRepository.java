package com.MovieService.MovieServices.repository;

import com.MovieService.MovieServices.model.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingsRepository extends JpaRepository<Ratings, Long> {
}