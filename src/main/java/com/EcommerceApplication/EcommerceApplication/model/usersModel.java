package com.EcommerceApplication.EcommerceApplication.model;

import com.EcommerceApplication.EcommerceApplication.constants.DatabaseConstants;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;

@Data
@Table(name = DatabaseConstants.TABLE_USERS) // Table name
@Entity
public class usersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment value of ID
    @Column(name="user_id")
    private long user_id;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name ="email" , nullable = false)
    private String email;
    @Column(name="password", nullable = false)
    private String password;
    @Column(name="phone", nullable = true)
    private long phone;
//    @Column(name="created_date", nullable = false)
//    private Date created_at;
    @Column(name = "created_at", updatable = false, insertable = false)
    private LocalDateTime created_at;
}
