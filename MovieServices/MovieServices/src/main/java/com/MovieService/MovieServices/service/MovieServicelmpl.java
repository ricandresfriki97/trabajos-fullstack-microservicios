package com.MovieService.MovieServices.service;

import com.MovieService.MovieServices.dto.MovieServiceRequestDTO;
import com.MovieService.MovieServices.dto.MovieServiceResponseDTO;
import com.MovieService.MovieServices.model.mapper.MovieServiceMapper;
import com.MovieService.MovieServices.repository.MovieServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
@RequiredArgsConstructor
public class MovieServicelmpl implements MovieServiceService {
    private final MovieServiceRepository movieServiceRepository;
    private final MovieServiceMapper movieServiceMapper;

    @Override
    public MovieServiceResponseDTO createMovieService(MovieServiceRequestDTO requestDTO) {
        var movieEntity = movieServiceMapper.toEntity(requestDTO);
        var savedMovie = movieServiceRepository.save(movieEntity);
        return movieServiceMapper.toDTO(savedMovie);
    }

    @Override
    public MovieServiceResponseDTO getMovieServiceById(Long id) {
        var movieEntity = movieServiceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found"));
        return movieServiceMapper.toDTO(movieEntity);
    }

    @Override
    public List<MovieServiceResponseDTO> getAllMovieServices() {
        var movies = movieServiceRepository.findAll();
        return movieServiceMapper.toDTOList(movies);
    }

    @Override
    public MovieServiceResponseDTO updateMovieService(Long id, MovieServiceRequestDTO requestDTO) {
        var existingMovie = movieServiceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found"));
        var updatedMovie = movieServiceMapper.toEntity(requestDTO);
        updatedMovie.setId(existingMovie.getId());
        var savedMovie = movieServiceRepository.save(updatedMovie);
        return movieServiceMapper.toDTO(savedMovie);
    }

    @Override
    public boolean deleteMovieService(Long id) {
        if (!movieServiceRepository.existsById(id)) {
            throw new RuntimeException("Movie not found");
        }
        movieServiceRepository.deleteById(id);
        return true;
    }
}