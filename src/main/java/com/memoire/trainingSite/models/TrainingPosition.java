package com.memoire.trainingSite.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "TrainingPosition")
public class TrainingPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PositionId")
    private Long  position_id;
    @Column(name = "PositionDescription")
    private String  position_description;
    @Column(name = "PositionPostingDate")
    private LocalDateTime  position_posting_date;
    @Column(name = "PositionVisibility")
    private Boolean  position_visibility;
    @Column(name = "PositionStatus")
    private PositionStatus  position_status;
    @Column(name = "PositionFreePlaces")
    private Integer  position_free_places;
    @Column(name = "PositionWorkType")
    private PositionWorkType  position_work_type;
    @Column(name = "PositionStartingDate")
    private LocalDateTime position_starting_date;
    @Column(name = "PositionDuration")
    private Integer position_duration;
    @Column(name = "PositionRequirements")
    private String position_requirements;
    private List<Application> applications ;

}
