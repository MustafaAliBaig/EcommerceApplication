package com.EcommerceApplication.EcommerceApplication.model;

import com.EcommerceApplication.EcommerceApplication.constants.DatabaseConstants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name= DatabaseConstants.TABLE_ROLES)
@Entity
public class rolesModel {

    @Id
    @Column(name="role_id")
    private int role_id;

    @Column(name="role_name")
    private String role_name;
}
