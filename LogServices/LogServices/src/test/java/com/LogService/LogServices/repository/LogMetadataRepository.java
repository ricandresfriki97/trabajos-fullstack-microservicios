package com.LogService.LogServices.repository;

import com.LogService.LogServices.model.LogMetadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogMetadataRepository extends JpaRepository<LogMetadata, Long> {
}