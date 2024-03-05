package com.memoire.trainingSite.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

@Data
@Getter
@Setter
@Embeddable
public class ApplicationId implements Serializable {

    @Column(name = "position_id")
    private long positionId;
    @Column(name = "applicant_id")
    private long applicantId;
}
