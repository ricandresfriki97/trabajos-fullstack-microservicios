package com.PaymentService.PaymentServices.repository;
import com.PaymentService.PaymentServices.model.PaymentService;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PaymentServiceRepository extends JpaRepository<PaymentService, Integer> {

}