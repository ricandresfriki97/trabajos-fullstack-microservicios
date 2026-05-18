package com.NotificationService.NotificationServices.controller;
import com.NotificationService.NotificationServices.service.NotificationServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@RestController
@RequestMapping("/api/vi/NotificationServices")
@RequiredArgsConstructor
public class NotificationServiceController {
    private final NotificationServiceService notificationServiceService;

    @GetMapping("/getAll")
    public ResponseEntity<List<String>> getAllNotifications() {
        List<String> notifications = notificationServiceService.getAllNotifications();
        return ResponseEntity.ok(notifications);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<String> getNotificationById(@PathVariable String id) {
        String notification = notificationServiceService.getNotificationById(id);
        if (notification != null) {
            return ResponseEntity.ok(notification);
        } else {
            return ResponseEntity.notFound().build();
        }
    }}