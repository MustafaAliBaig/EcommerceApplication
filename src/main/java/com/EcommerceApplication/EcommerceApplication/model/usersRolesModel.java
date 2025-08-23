package com.EcommerceApplication.EcommerceApplication.model;

import com.EcommerceApplication.EcommerceApplication.constants.DatabaseConstants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name= DatabaseConstants.TABLE_USERS_Roles)
@Entity
public class usersRolesModel {

    @Id
    @Column(name="user_id")
    private int user_id;
    @Column(name="role_id")
    private int role_id;
}
