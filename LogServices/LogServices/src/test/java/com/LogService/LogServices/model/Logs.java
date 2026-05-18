package com.LogService.LogServices.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;
import lombok.EqualsAndHashCode;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Logs{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date timestamp;
    private String logLevel;
    private String message;
    private String source;
    @OneToMany(mappedBy = "logs", cascade = CascadeType.ALL, orphanRemoval = true)
    @EqualsAndHashCode.Exclude
    private List<Logs> logsList;
}
