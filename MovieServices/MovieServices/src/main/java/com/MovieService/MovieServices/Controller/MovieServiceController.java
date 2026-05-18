package com.MovieService.MovieServices.Controller;


import com.MovieService.MovieServices.dto.MovieServiceResponseDTO;
import com.MovieService.MovieServices.service.MovieServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/api/v1/moviesservice")
@RequiredArgsConstructor
public class MovieServiceController {
    private final MovieServiceService movieservice;
    @GetMapping("/{id}")
    public ResponseEntity<MovieServiceResponseDTO> getMovieById(@PathVariable Long id) {
        MovieServiceResponseDTO movie = movieservice.getMovieServiceById(id);
        return ResponseEntity.ok(movie);
    }
    @GetMapping()
    public ResponseEntity<List<MovieServiceResponseDTO>> getAllMovies() {
        List<MovieServiceResponseDTO> movies = movieservice.getAllMovieServices();
        return ResponseEntity.ok(movies);
    }
}