package com.example.test.controllers;

import com.example.test.dtos.ProductRequestDTO;
import com.example.test.dtos.ProductResponseDTO;
import com.example.test.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private ProductService productService;

    private ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/create")
    public ResponseEntity<ProductResponseDTO> createProductController(@RequestBody ProductRequestDTO productRequestDTO) {
      return productService.createProduct(productRequestDTO);
    }
}
