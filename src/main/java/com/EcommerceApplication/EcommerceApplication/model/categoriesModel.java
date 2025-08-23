package com.EcommerceApplication.EcommerceApplication.model;

import com.EcommerceApplication.EcommerceApplication.constants.DatabaseConstants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name= DatabaseConstants.TABLE_CATEGORIES)
@Entity
public class categoriesModel {

    @Id
    @Column(name="category_id")
    private int category_id;

    @Column(name ="category_name")
    private String category_name;

}
