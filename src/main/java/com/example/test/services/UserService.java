package com.example.test.services;

import com.example.test.dtos.SignInDTO;
import com.example.test.dtos.UserDTO;
import org.springframework.http.ResponseEntity;

public interface UserService {
    public ResponseEntity<String> createUser(UserDTO userDTO);

    ResponseEntity<UserDTO> signIn(SignInDTO signInDTO);
}
