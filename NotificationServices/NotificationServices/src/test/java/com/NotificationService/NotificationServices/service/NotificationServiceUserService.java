package com.NotificationService.NotificationServices.service;
import com.NotificationService.NotificationServices.dto.NotificationServiceUserRequestDTO;
import com.NotificationService.NotificationServices.dto.NotificationServiceUserResponseDTO;
import java.util.List;
public interface NotificationServiceUserService {
    NotificationServiceUserResponseDTO createUser(NotificationServiceUserRequestDTO requestDTO);
    List<NotificationServiceUserResponseDTO> getAllUsers();
    NotificationServiceUserResponseDTO getUserById(String userId);
}