package com.PaymentService.PaymentServices.service;

import com.PaymentService.PaymentServices.dto.PaymentRequestDTO;
import com.PaymentService.PaymentServices.dto.PaymentResponseDTO;
import com.PaymentService.PaymentServices.model.Payment;
import com.PaymentService.PaymentServices.model.mapper.PaymentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymenteServicelmpl implements PaymentService {
    private final PaymentMapper paymentMapper;

    @Override
    public PaymentResponseDTO getPaymentById(Long id) {
        return null;
    }

    @Override
    public List<PaymentResponseDTO> getAllPayments() {
        return null;
    }

    @Override
    public PaymentResponseDTO createPayment(PaymentRequestDTO paymentRequestDTO) {
        Payment payment = paymentMapper.toEntity(paymentRequestDTO);
        return paymentMapper.toDTO(payment);
    }

    @Override
    public PaymentResponseDTO updatePayment(Long id, PaymentRequestDTO paymentRequestDTO) {
        return null;
    }

    @Override
    public boolean deletePayment(Long id) {
        return false;
    }
}