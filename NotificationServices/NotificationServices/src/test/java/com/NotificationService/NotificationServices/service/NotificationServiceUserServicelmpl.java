package com.NotificationService.NotificationServices.service;
import com.NotificationService.NotificationServices.dto.NotificationServiceUserRequestDTO;
import com.NotificationService.NotificationServices.dto.NotificationServiceUserResponseDTO;
import com.NotificationService.NotificationServices.mapper.NotificationServiceUserMapper;
import com.NotificationService.NotificationServices.repository.NotificationServiceUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class NotificationServiceUserServicelmpl implements NotificationServiceUserService {
    private final NotificationServiceUserRepository notificationServiceUserRepository;
    private final NotificationServiceUserMapper notificationServiceUserMapper;
    @Override
    public NotificationServiceUserResponseDTO createUser(NotificationServiceUserRequestDTO requestDTO) {
        var entity = notificationServiceUserMapper.toEntity(requestDTO);
        var savedEntity = notificationServiceUserRepository.save(entity);
        return notificationServiceUserMapper.toDTO(savedEntity);
    }
    @Override
    public List<NotificationServiceUserResponseDTO> getAllUsers() {
        var entities = notificationServiceUserRepository.findAll();
        return notificationServiceUserMapper.toDTOList(entities);
    }
    @Override
    public NotificationServiceUserResponseDTO getUserById(String userId) {
        var entity = notificationServiceUserRepository.findById(Integer.parseInt(userId))
                .orElseThrow(() -> new RuntimeException("User not found"));
        return notificationServiceUserMapper.toDTO(entity);
    }
}
