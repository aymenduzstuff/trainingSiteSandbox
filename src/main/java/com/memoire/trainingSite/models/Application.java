package com.memoire.trainingSite.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "applicationId")
    private Integer application_id  ;
    @Column
    private Applicant applicant = new Applicant() ;
    private TrainingPosition trainingPosition = new TrainingPosition() ;
    private LocalDateTime ApplicationDate   ;
    private String ApplicationMotivation ;
    private ApplicationStatus applicationStatus ;

}
