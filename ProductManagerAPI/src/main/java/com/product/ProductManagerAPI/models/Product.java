package com.product.ProductManagerAPI.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String name;
    private String description;
    private int cost;
    private String category;

    public Product(String name, String description, int cost, String category) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.category = category;
    }

}
