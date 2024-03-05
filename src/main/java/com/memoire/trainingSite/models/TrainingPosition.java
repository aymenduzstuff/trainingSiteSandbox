package com.memoire.trainingSite.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.*;

@Entity
@Data
public class TrainingPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "positionId")
    private Long  position_id ;
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
    //@JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "PositionWorkType")
    private PositionWorkType  position_work_type;
    @Column(name = "PositionStartingDate")
    private LocalDateTime position_starting_date;
    @Column(name = "PositionDuration")
    private Integer position_duration;
    @Column(name = "PositionRequirements")
    private String position_requirements;
    @OneToMany(mappedBy = "trainingPositions")
    private List<Region> regions = new ArrayList<>() ;
    @OneToMany(mappedBy = "position")
    private List<Application> applications = new ArrayList<>() ;

}
