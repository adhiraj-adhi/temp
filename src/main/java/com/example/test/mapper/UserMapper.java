package com.example.test.mapper;

import com.example.test.dtos.UserDTO;
import com.example.test.models.User;

public class UserMapper {
    public static User userDTOToUser(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setAddress(userDTO.getAddress());
        user.setPassword(userDTO.getPassword());
        return user;
    }

    public static UserDTO userToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setEmail(user.getEmail());
        userDTO.setAddress(user.getAddress());
        return userDTO;
    }
}
