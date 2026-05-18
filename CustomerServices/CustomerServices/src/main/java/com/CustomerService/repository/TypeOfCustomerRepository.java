package com.customerservice.repository;

import com.customerservice.model.TypeOfCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfCustomerRepository extends JpaRepository<TypeOfCustomer, Long> {
}

