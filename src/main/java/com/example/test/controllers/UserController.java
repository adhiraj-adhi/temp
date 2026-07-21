package com.example.test.controllers;

import com.example.test.dtos.SignInDTO;
import com.example.test.dtos.UserDTO;
import com.example.test.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/create")
    public ResponseEntity<String> createUserController(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }
    @PostMapping("/signIn")
    public ResponseEntity<UserDTO> signInController(@RequestBody SignInDTO signInDTO) {
        return userService.signIn(signInDTO);
    }
}
