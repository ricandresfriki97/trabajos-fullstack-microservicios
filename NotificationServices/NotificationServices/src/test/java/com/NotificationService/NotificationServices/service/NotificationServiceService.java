package com.NotificationService.NotificationServices.service;
import com.NotificationService.NotificationServices.dto.NotificationServiceRequestDTO;
import com.NotificationService.NotificationServices.dto.NotificationServiceResponseDTO;
import java.util.List;
public interface NotificationServiceService {
    NotificationServiceResponseDTO createNotification(NotificationServiceRequestDTO requestDTO);
    List<NotificationServiceResponseDTO> getAllNotifications();
    NotificationServiceResponseDTO getNotificationById(String id);
    void deleteNotification(String id);
}