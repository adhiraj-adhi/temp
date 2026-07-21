package com.example.test.dtos;

import lombok.Data;

@Data
public class ProductRequestDTO {
    private String productName;
    private String description;
    private double price;
    private double discount;
    private double specialPrice;
}
