package com.MovieService.MovieServices.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MovieService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String director;
    private int releaseYear;
    private String genre;

    @OneToMany(mappedBy = "movieService", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ratings> ratings;
}