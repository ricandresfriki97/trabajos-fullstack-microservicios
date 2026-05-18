package com.MovieService.MovieServices.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name= "Ratings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ratings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long movieId;
    private Long userId;
    private Double ratingValue;
    private String review;

    @ElementCollection
    @CollectionTable(name = "rating_tags", joinColumns = @JoinColumn(name = "rating_id"))
    @Column(name = "tag")
    private java.util.List<String> tags;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_service_id")
    private MovieService movieService;
}
