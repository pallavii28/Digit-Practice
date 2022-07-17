package com.crud.bean;

import javax.persistence.*;

@Entity

public class Cloth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    @Column(length = 20)
    private String productName;
    @Column(length = 20)
    private String type;
    private double productPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
