package com.memoire.trainingSite.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity

public class ApplicantProfile extends  Profile{

    private List<Degree> degrees = new ArrayList<>() ;
    private List<Project> projects = new ArrayList<>() ;
    private String Current_level;
}
