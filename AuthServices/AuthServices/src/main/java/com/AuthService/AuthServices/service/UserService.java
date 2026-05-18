package com.AuthService.AuthServices.service;

import com.AuthService.AuthServices.dto.UserRequestDTO;
import com.AuthService.AuthServices.dto.UserResponseDTO;
import java.util.List;

public interface UserService {
    UserResponseDTO createUser(UserRequestDTO userRequestDTO);

    UserResponseDTO getUserById(Long id);

    List<UserResponseDTO> getAllUsers();

    UserResponseDTO updateUser(Long id, UserRequestDTO userRequestDTO);

    boolean deleteUser(Long id);
}

