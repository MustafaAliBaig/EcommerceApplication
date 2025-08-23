package com.EcommerceApplication.EcommerceApplication.model;

import com.EcommerceApplication.EcommerceApplication.constants.DatabaseConstants;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Table(name= DatabaseConstants.TABLE_ORDERS)
@Entity
public class ordersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private int order_id;
    @Column(name="user_id")
    private int user_id;
    @Column(name="total_amount")
    private BigDecimal total_amount;
    @Enumerated(EnumType.STRING)
    @Column(name = "order_status", columnDefinition = "ENUM('PLACED', 'PROCESSING', 'SHIPPED', 'DELIVERED', 'CANCELLED') DEFAULT 'PLACED'")
    private OrderStatus orderStatus = OrderStatus.PLACED;
    @Column(name = "order_date", updatable = false, insertable = false)
    private LocalDateTime order_date;
}
