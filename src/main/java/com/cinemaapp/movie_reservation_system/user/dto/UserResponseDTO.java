package com.cinemaapp.movie_reservation_system.user.dto;

import com.cinemaapp.movie_reservation_system.user.Role;
import lombok.Data;

@Data
public class UserResponseDTO {
    private Long id;
    private String email;
    private Role role;
}
