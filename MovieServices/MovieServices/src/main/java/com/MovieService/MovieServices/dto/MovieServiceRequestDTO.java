package com.MovieService.MovieServices.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieServiceRequestDTO {
    @NotBlank(message = "Title is required")
    private String title;
    @NotNull
    private String director;
    @NotNull
    private int releaseYear;
    @NotBlank(message = "Genre is required")
    private String genre;
}