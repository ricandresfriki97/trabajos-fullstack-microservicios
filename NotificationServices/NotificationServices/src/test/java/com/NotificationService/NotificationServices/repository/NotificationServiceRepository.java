package com.NotificationService.NotificationServices.repository;

import com.NotificationService.NotificationServices.model.NotificationServiceUser;
import org.springframework.data.jpa.repository.JpaRepository;
public interface NotificationServiceRepository extends JpaRepository<NotificationServiceUser,Integer> {

}