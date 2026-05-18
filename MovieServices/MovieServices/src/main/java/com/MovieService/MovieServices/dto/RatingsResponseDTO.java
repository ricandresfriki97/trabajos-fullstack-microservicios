package com.MovieService.MovieServices.dto;


import com.MovieService.MovieServices.model.MovieService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RatingsResponseDTO {
    private Long id;
    private Long movieId;
    private Long userId;
    private Double ratingValue;
    private String review;
    private List<String> tags;
    private Date createdAt;
    private Date updatedAt;
    private List<MovieService> movieServices;
}