package com.example.test.mapper;

import com.example.test.dtos.ProductRequestDTO;
import com.example.test.dtos.ProductResponseDTO;
import com.example.test.models.Product;

public class ProductMapper {
    public static Product productRequestDtoToProduct(ProductRequestDTO productRequestDTO){
        Product product=new Product();
        product.setProductName(productRequestDTO.getProductName());
        product.setDescription(productRequestDTO.getDescription());
        product.setPrice(productRequestDTO.getPrice());
        product.setDiscount(productRequestDTO.getDiscount());
        product.setSpecialPrice(productRequestDTO.getSpecialPrice());
        return product;
    }

    public static ProductResponseDTO productToProductResponseDTO(Product product){
        ProductResponseDTO productResponseDTO=new ProductResponseDTO();
        productResponseDTO.setProductName(product.getProductName());
        productResponseDTO.setDescription(product.getDescription());
        productResponseDTO.setPrice(product.getPrice());
        productResponseDTO.setDiscount(product.getDiscount());
        productResponseDTO.setSpecialPrice(product.getSpecialPrice());
        return productResponseDTO;
    }
}
