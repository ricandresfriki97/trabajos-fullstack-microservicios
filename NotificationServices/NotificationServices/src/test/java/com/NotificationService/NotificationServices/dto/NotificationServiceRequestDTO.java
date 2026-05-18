package com.NotificationService.NotificationServices.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationServiceRequestDTO {
    @NotBlank(message = "Title is mandatory")
    private String title;
    @NotBlank(message = "Message is mandatory")
    private String message;
    @NotNull(message = "Recipient ID is mandatory")
    private String recipientId;
    private Date timestamp;}