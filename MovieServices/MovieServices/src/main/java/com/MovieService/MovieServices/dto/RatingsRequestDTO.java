package com.MovieService.MovieServices.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RatingsRequestDTO {
    @NotNull(message = "Movie ID is required")
    private Long movieId;
    @NotNull(message = "User ID is required")
    private Long userId;
    @NotNull(message = "Rating value is required")
    private Double ratingValue;
    private String review;
    private List<String> tags;
}
