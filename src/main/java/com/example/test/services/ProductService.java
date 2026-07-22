package com.example.test.services;

import com.example.test.dtos.ProductRequestDTO;
import com.example.test.dtos.ProductResponseDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    public ResponseEntity<ProductResponseDTO> createProduct(ProductRequestDTO productRequestDTO);

    ResponseEntity<ProductResponseDTO> getProductById(Long productId);

    ResponseEntity<List<ProductResponseDTO>> getAllProduct();
}
