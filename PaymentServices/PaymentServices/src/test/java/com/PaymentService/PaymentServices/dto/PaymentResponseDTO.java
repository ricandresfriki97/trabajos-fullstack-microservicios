package com.PaymentService.PaymentServices.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponseDTO {
    private Long id;
    private Double amount;
    private String currency;
    private String paymentMethod;
    private String paymentDate;}
