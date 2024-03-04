package com.memoire.trainingSite.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Company extends User{
    @Column(name = "CompanyName")
    private  String CompanyName;
}
