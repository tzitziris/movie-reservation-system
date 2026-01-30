package com.cinemaapp.movie_reservation_system.user.dto;

import com.cinemaapp.movie_reservation_system.user.Role;
import lombok.Data;

@Data
public class UserCreateRequestDTO {
    private String email;
    private String password;
    private Role role;
}
