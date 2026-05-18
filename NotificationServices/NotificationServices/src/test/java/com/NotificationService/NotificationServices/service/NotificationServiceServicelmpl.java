package com.NotificationService.NotificationServices.service;
import com.NotificationService.NotificationServices.dto.NotificationServiceRequestDTO;
import com.NotificationService.NotificationServices.dto.NotificationServiceResponseDTO;
import com.NotificationService.NotificationServices.mapper.NotificationServiceMapper;
import com.NotificationService.NotificationServices.repository.NotificationServiceRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class NotificationServiceServicelmpl {
    private final NotificationServiceRepository notificationServiceRepository;
    private final NotificationServiceMapper notificationServiceMapper;
    @Override
    public NotificationServiceResponseDTO createNotification(NotificationServiceRequestDTO requestDTO) {
        var entity = notificationServiceMapper.toEntity(requestDTO);
        var savedEntity = notificationServiceRepository.save(entity);
        return notificationServiceMapper.toDTO(savedEntity);
    }
    @Override
    public List<NotificationServiceResponseDTO> getAllNotifications() {
        var entities = notificationServiceRepository.findAll();
        return notificationServiceMapper.toDTOList(entities);
    }
    @Override
    public NotificationServiceResponseDTO getNotificationById(String id) {
        var entity = notificationServiceRepository.findById(Integer.parseInt(id))
                .orElseThrow(() -> new RuntimeException("Notification not found"));
        return notificationServiceMapper.toDTO(entity);
    }
    @Override
    public void deleteNotification(String id) {
        if (!notificationServiceRepository.existsById(Integer.parseInt(id))) {
            throw new RuntimeException("Notification not found");
        }
        notificationServiceRepository.deleteById(Integer.parseInt(id));
    }}