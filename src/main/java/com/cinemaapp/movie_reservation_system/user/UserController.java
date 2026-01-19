package com.cinemaapp.movie_reservation_system.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers(); // Χρησιμοποίησε τη μεταβλητή στιγμιότυπου
    }

//    @PostMapping
//    public User createUser(@RequestBody User user) {
//        return userService.createUser();
//    }
}
