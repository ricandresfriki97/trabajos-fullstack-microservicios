package com.RentalService.RentalServices.repository;

import com.RentalService.RentalServices.model.RentalServiceBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalServiceBookingRepository extends JpaRepository<RentalServiceBooking, Long> {
}