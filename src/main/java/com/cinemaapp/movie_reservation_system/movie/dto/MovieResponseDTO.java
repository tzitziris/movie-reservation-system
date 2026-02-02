package com.cinemaapp.movie_reservation_system.movie.dto;

import com.cinemaapp.movie_reservation_system.movie.Genre;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieResponseDTO {
    private Long id;
    private String title;
    private String description;
    private Genre genre;
    private String posterUrl;
}
