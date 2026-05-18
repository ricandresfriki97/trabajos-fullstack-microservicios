package com.MovieService.MovieServices.service;


import com.MovieService.MovieServices.dto.RatingsRequestDTO;
import com.MovieService.MovieServices.dto.RatingsResponseDTO;

import java.util.List;

public interface RatingsService {
    RatingsResponseDTO createRating(RatingsRequestDTO requestDTO);
    RatingsResponseDTO getRatingById(Long id);
    List<RatingsResponseDTO> getAllRatings();
    RatingsResponseDTO updateRating(Long id, RatingsRequestDTO requestDTO);
    boolean deleteRating(Long id);
}