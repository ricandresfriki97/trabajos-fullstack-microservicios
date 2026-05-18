package com.PaymentService.PaymentServices.repository;
import com.PaymentService.PaymentServices.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}