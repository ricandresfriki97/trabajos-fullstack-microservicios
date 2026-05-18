package com.PaymentService.PaymentServices.service;

import com.PaymentService.PaymentServices.dto.PaymentRequestDTO;
import com.PaymentService.PaymentServices.dto.PaymentResponseDTO;
import java.util.List;

public interface PaymentService {
    PaymentResponseDTO getPaymentById(Long id);

    List<PaymentResponseDTO> getAllPayments();

    PaymentResponseDTO createPayment(PaymentRequestDTO paymentRequestDTO);

    PaymentResponseDTO updatePayment(Long id, PaymentRequestDTO paymentRequestDTO);

    boolean deletePayment(Long id);
}