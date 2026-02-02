package com.cinemaapp.movie_reservation_system.movie;

import com.cinemaapp.movie_reservation_system.movie.dto.MovieCreateRequestDTO;
import com.cinemaapp.movie_reservation_system.movie.dto.MovieResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<MovieResponseDTO> getAllMovies() {
        return movieRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    private MovieResponseDTO mapToResponse(Movie movie) {
        MovieResponseDTO dto = new MovieResponseDTO();
        dto.setId(movie.getId());
        dto.setTitle(movie.getTitle());
        dto.setDescription(movie.getDescription());
        dto.setGenre(movie.getGenre());
        dto.setPosterUrl(movie.getPosterUrl());
        return dto;
    }

    public MovieResponseDTO createMovie(MovieCreateRequestDTO request) {
        Movie movie = new Movie();
        movie.setTitle(request.getTitle());
        movie.setDescription(request.getDescription());
        movie.setGenre(request.getGenre());
        movie.setPosterUrl(request.getPosterUrl());

        Movie savedMovie = movieRepository.save(movie);
        return mapToResponse(savedMovie);
    }

    public MovieResponseDTO getMovieById(Long id) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Movie not found with id: " + id));
        return mapToResponse(movie);
    }

    public MovieResponseDTO updateMovie(Long id, MovieCreateRequestDTO request) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Movie not found with id: " + id));
        
        movie.setTitle(request.getTitle());
        movie.setDescription(request.getDescription());
        movie.setGenre(request.getGenre());
        movie.setPosterUrl(request.getPosterUrl());
        
        Movie updatedMovie = movieRepository.save(movie);
        return mapToResponse(updatedMovie);
    }

    public void deleteMovie(Long id) {
        if (!movieRepository.existsById(id)) {
            throw new IllegalArgumentException("Movie not found with id: " + id);
        }
        movieRepository.deleteById(id);
    }
}
