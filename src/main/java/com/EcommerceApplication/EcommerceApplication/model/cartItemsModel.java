package com.EcommerceApplication.EcommerceApplication.model;

import com.EcommerceApplication.EcommerceApplication.constants.DatabaseConstants;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name= DatabaseConstants.TABLE_CART_ITEMS)
@Entity
public class cartItemsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_item_id")
    private int cart_item_id;
    @Column(name="cart_id")
    private int cart_id;
    @Column(name="product_id")
    private int product_id;
    @Column(name="quantity")
    private int quantity;

}
