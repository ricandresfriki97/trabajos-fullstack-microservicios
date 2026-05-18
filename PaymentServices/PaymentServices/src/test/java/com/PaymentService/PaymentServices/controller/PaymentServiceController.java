package com.PaymentService.PaymentServices.controller;

import  com.PaymentService.PaymentServices.dto.PaymentServiceResponseDTO;
import  com.PaymentService.PaymentServices.service.PaymentServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("api/v1/PaymentServices")
@RequiredArgsConstructor
public class PaymentServiceController {
    private final PaymentServiceService paymentServiceService;
    @GetMapping("/{id}")
    public ResponseEntity<PaymentServiceResponseDTO> getPaymentServiceById(@PathVariable Long id) {
        PaymentServiceResponseDTO paymentService = paymentServiceService.getPaymentServiceById(id);
        return ResponseEntity.ok(paymentService);
    }
    @GetMapping
    public ResponseEntity<List<PaymentServiceResponseDTO>> getAllPaymentServices() {
        List<PaymentServiceResponseDTO> paymentServices = paymentServiceService.getAllPaymentServices();
        return ResponseEntity.ok(paymentServices);
    }
}