package com.example.test.dtos;

import lombok.Data;

@Data
public class ProductResponseDTO {
    private String productName;
    private String description;
    private double price;
    private double discount;
    private double specialPrice;

    private String message;
}
