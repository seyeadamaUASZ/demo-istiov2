package com.example;

import lombok.Data;

@Data
public class ProductRequest {
    private Long id;
    private String name;
    private String description;
    private int quantity;
    private double price;
}
