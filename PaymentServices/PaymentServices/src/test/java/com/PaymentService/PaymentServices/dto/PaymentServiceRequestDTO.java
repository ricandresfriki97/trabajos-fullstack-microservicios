package com.PaymentService.PaymentServices.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentServiceRequestDTO {
    @NotNull(message = "Amount cannot be null")
    private Double amount;
    @NotBlank(message = "Currency cannot be blank")
    private String currency;
    @NotBlank(message = "Payment method cannot be blank")
    private String paymentMethod;
    @NotNull(message = "Payment date cannot be null")
    private Date paymentDate;}