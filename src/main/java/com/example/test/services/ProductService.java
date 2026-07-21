package com.example.test.services;

import com.example.test.dtos.ProductRequestDTO;
import com.example.test.dtos.ProductResponseDTO;
import org.springframework.http.ResponseEntity;

public interface ProductService {
    public ResponseEntity<ProductResponseDTO> createProduct(ProductRequestDTO productRequestDTO);
}
