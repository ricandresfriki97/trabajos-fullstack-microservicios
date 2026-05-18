package com.PaymentService.PaymentServices.service;

import com.PaymentService.PaymentServices.dto.PaymentServiceRequestDTO;
import com.PaymentService.PaymentServices.dto.PaymentServiceResponseDTO;
import com.PaymentService.PaymentServices.model.mapper.PaymentServiceMapper;
import com.PaymentService.PaymentServices.repository.PaymentServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PaymentServiceServicelmpl implements PaymentServiceService {
    private final PaymentServiceRepository paymentServiceRepository;
    private final PaymentServiceMapper paymentServiceMapper;

    @Override
    public PaymentServiceResponseDTO getPaymentServiceById(Long id) {
        return null;
    }

    @Override
    public List<PaymentServiceResponseDTO> getAllPaymentServices() {
        return null;
    }

    @Override
    public PaymentServiceResponseDTO createPaymentService(PaymentServiceRequestDTO paymentServiceRequestDTO) {
        return null;
    }

    @Override
    public PaymentServiceResponseDTO updatePaymentService(Long id, PaymentServiceRequestDTO paymentServiceRequestDTO) {
        return null;
    }

    @Override
    public boolean deletePaymentService(Long id) {
        return false;
    }
}