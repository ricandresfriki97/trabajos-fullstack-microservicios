package com.RentalService.RentalServices.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name = "RentalServiceBooking")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentalServiceBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long rentalServiceId;

    private Long userId;

    private String startDate;

    private String endDate;

    private String status;
}