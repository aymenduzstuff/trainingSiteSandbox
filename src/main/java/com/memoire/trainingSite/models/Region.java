package com.memoire.trainingSite.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer region_id ;
    private String region_name  ;
    @OneToMany
    private List<TrainingPosition> trainingPositions = new ArrayList<>() ;

}
