package com.memoire.trainingSite.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Applicant extends SiteUser {
    //@Column(name = "applicant_id")
    //private long user_id;
    @Column(name="FirstName")
    private String Applicant_firstname;
    @Column(name="LastName")

    private String Applicant_lastname;
    @Column(name="Birthday")

    private String Applicant_birthday;
    @OneToMany(mappedBy = "applicant")
    private List<Application> applications = new ArrayList<>() ;

}
