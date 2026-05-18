package com.PaymentService.PaymentServices.service;

import com.PaymentService.PaymentServices.dto.PaymentServiceRequestDTO;
import com.PaymentService.PaymentServices.dto.PaymentServiceResponseDTO;
import java.util.List;


public interface PaymentServiceService {
    PaymentServiceResponseDTO getPaymentServiceById(Long id);

    List<PaymentServiceResponseDTO> getAllPaymentServices();

    PaymentServiceResponseDTO createPaymentService(PaymentServiceRequestDTO paymentServiceRequestDTO);

    PaymentServiceResponseDTO updatePaymentService(Long id, PaymentServiceRequestDTO paymentServiceRequestDTO);

    boolean deletePaymentService(Long id);
}