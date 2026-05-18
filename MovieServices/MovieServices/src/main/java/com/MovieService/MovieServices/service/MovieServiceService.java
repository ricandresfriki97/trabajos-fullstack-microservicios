package com.MovieService.MovieServices.service;

import com.MovieService.MovieServices.dto.MovieServiceRequestDTO;
import com.MovieService.MovieServices.dto.MovieServiceResponseDTO;

import java.util.List;

public interface MovieServiceService {
    MovieServiceResponseDTO createMovieService(MovieServiceRequestDTO requestDTO);
    MovieServiceResponseDTO getMovieServiceById(Long id);
    List<MovieServiceResponseDTO> getAllMovieServices();
    MovieServiceResponseDTO updateMovieService(Long id, MovieServiceRequestDTO requestDTO);
    boolean deleteMovieService(Long id);
}