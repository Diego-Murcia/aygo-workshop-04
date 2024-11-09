package co.edu.eci.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @GetMapping("/{userId}")
    public String getUserById(@PathVariable("userId") String userId) {
        return "User with id: " + userId;
    }

    @PostMapping
    public String createUser() {
        return "User created";
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable("userId") String userId) {
        return "User with id: " + userId + " updated";
    }
}
