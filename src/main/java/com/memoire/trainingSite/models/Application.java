package com.memoire.trainingSite.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Entity
@Data
public class Application {
    @EmbeddedId
    private ApplicationId Id  ;
    @ManyToOne
    Applicant applicant  ;
    @ManyToOne
    TrainingPosition position ;
    private LocalDateTime application_date;
    private String application_motivation;
    private ApplicationStatus application_status;
}
