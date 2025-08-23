package com.EcommerceApplication.EcommerceApplication.model;

import com.EcommerceApplication.EcommerceApplication.constants.DatabaseConstants;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Table(name= DatabaseConstants.TABLE_ORDER_ITEMS)
@Entity
public class orderItemsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_item_id")
    private int order_item_id;
    @Column(name="order_id")
    private int order_id;
    @Column(name="product_id")
    private int product_id;
    @Column(name="quantity", nullable = false)
    @Positive(message= "Quantity must be greater than 0")
    private int quantity;
    @Column(name="price")
    private BigDecimal price;
}
