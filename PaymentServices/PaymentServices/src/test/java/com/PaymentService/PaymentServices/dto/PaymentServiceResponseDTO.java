package com.PaymentService.PaymentServices.dto;
import com.PaymentService.PaymentServices.model.PaymentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentServiceResponseDTO {
    private Long id;
    private Double amount;
    private String currency;
    private String paymentMethod;
    private Date paymentDate;}

