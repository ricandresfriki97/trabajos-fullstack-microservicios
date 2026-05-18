package com.LogService.LogServices.controller;

import com.LogService.LogServices.dto.LogsResponseDTO;
import com.LogService.LogServices.service.LogsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/LogServices")
@RequiredArgsConstructor
public class LogServiceController {

    private final LogsService logsService;

    @GetMapping("/logs/{id}")
    public ResponseEntity<LogsResponseDTO> getLogsById(@PathVariable Long id) {
        LogsResponseDTO logsResponseDTO = logsService.getLogsById(id);
        return ResponseEntity.ok(logsResponseDTO);
    }
}
