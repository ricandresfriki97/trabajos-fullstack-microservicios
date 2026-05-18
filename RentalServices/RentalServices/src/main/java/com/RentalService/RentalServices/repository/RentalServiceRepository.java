package com.RentalService.RentalServices.repository;

import com.RentalService.RentalServices.model.RentalService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalServiceRepository extends JpaRepository<RentalService, Long> {
}