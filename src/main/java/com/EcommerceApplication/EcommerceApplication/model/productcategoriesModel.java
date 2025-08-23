package com.EcommerceApplication.EcommerceApplication.model;


import com.EcommerceApplication.EcommerceApplication.constants.DatabaseConstants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name= DatabaseConstants.TABLE_PRODUCT_CATEGORIES)
@Entity
public class productcategoriesModel {

    @Id
    @Column(name="product_id")
    private int product_id;
    @Column(name="category_id")
    private int category_id;
}
