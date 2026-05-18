package com.PaymentService.PaymentServices.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequestDTO {
    @NotNull(message = "Amount cannot be null")
    private Double amount;
    @NotBlank(message = "Currency cannot be blank")
    private String currency;
    @NotBlank(message = "Payment method cannot be blank")
    private String paymentMethod;
    @NotNull(message = "Payment date cannot be null")
    private String paymentDate;}