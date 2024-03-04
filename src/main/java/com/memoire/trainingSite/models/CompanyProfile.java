package com.memoire.trainingSite.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class CompanyProfile extends Profile{
    @Column(name = "StaffCount")
    private String Company_nbr_employees;
}
