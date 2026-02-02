package com.cinemaapp.movie_reservation_system.movie.dto;

import com.cinemaapp.movie_reservation_system.movie.Genre;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MovieCreateRequestDTO {
    @NotBlank(message = "Title is required")
    private String title;
    
    @NotBlank(message = "Description is required")
    private String description;
    
    @NotNull(message = "Genre is required")
    private Genre genre;
    
    private String posterUrl;
}
