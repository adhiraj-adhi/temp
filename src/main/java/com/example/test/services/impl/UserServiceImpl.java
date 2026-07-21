package com.example.test.services.impl;

import com.example.test.data.UserRepository;
import com.example.test.dtos.SignInDTO;
import com.example.test.dtos.UserDTO;
import com.example.test.mapper.UserMapper;
import com.example.test.models.User;
import com.example.test.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public ResponseEntity<String> createUser(UserDTO userDTO) {
        User user = UserMapper.userDTOToUser(userDTO);
        User createdUser = userRepository.save(user);
        if (createdUser!=null) {
            return new ResponseEntity<>("User Created Successfully!!", HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Failed to create user", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public ResponseEntity<UserDTO> signIn(SignInDTO signInDTO) {
        String username = signInDTO.getUsername();
        String password = signInDTO.getPassword();

        User savedUser = userRepository.findByUsername(username);
        if (savedUser==null || !savedUser.getPassword().equals(password)) {
            return new ResponseEntity<>(new UserDTO(), HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(UserMapper.userToUserDTO(savedUser));
    }


}
