package com.MovieService.MovieServices.repository;

import com.MovieService.MovieServices.model.MovieService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieServiceRepository extends JpaRepository<MovieService, Long> {
}
