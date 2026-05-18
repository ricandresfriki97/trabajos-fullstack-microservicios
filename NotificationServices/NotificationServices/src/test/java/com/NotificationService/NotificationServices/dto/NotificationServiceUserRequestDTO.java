package com.NotificationService.NotificationServices.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationServiceUserRequestDTO {
    @NotBlank(message = "User ID is mandatory")
    private String userId;}
