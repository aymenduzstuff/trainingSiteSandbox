package com.memoire.trainingSite.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "UserId")
    private Long user_id;
    @Column(name ="Username" )
    private String username;
    @Column(name ="Password" )
    private String user_password;
    @Column(name = "JoinDate")
    private LocalDateTime user_join_date;
    @Column(name = "Status")
    private UserStatus user_status;
    @Column(name ="PhoneNumber")
    private String user_phone_number;
}
