package com.cinemaapp.movie_reservation_system.user.dto;

import com.cinemaapp.movie_reservation_system.user.Role;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {
    private Long id;
    private String email;
    private Role role;
}
