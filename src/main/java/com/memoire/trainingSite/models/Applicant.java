package com.memoire.trainingSite.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Applicant extends  User{
    @Column(name="FirstName")
    private String Applicant_firstname;
    @Column(name="LastName")

    private String Applicant_lastname;
    @Column(name="Birthday")

    private String Applicant_birthday;
    private List<Application> applications ;

}
