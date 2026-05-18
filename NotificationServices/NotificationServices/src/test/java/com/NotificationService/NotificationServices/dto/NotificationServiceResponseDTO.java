package com.NotificationService.NotificationServices.dto;
import com.NotificationService.NotificationServices.model.NotificationService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationServiceResponseDTO {
    private String id;
    private String title;
    private String message;
    private String recipientId;
    private Date timestamp;
    public static NotificationServiceResponseDTO fromEntity(NotificationService notificationService) {
        return new NotificationServiceResponseDTO(
                notificationService.getId(),
                notificationService.getTitle(),
                notificationService.getMessage(),
                notificationService.getRecipientId(),
                notificationService.getTimestamp()
        );
    }
    public static List<NotificationServiceResponseDTO> fromEntityList(List<NotificationService> notificationServices) {
        return notificationServices.stream()
                .map(NotificationServiceResponseDTO::fromEntity)
                .toList();
    }}