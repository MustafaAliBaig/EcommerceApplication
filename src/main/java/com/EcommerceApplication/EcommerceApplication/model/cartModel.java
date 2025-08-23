package com.EcommerceApplication.EcommerceApplication.model;

import com.EcommerceApplication.EcommerceApplication.constants.DatabaseConstants;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Table(name= DatabaseConstants.TABLE_CART)
@Entity
public class cartModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_id")
    private int cart_id;
    @Column(name="user_id")
    private int user_id;
    @Column(name = "created_at", updatable = false, insertable = false)
    private LocalDateTime created_at;
}
