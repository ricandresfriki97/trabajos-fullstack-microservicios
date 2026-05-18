package com.customerservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer_services")
@ToString(exclude = "typeOfCustomers")
public class CustomerService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Date createdAt;
    private Date updatedAt;

    @OneToMany(mappedBy = "customerService", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<TypeOfCustomer> typeOfCustomers;
}

