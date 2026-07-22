package com.example.test.controllers;

import com.example.test.dtos.ProductRequestDTO;
import com.example.test.dtos.ProductResponseDTO;
import com.example.test.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/get/{productId}")
    public ResponseEntity<ProductResponseDTO> getProductByIdController(@PathVariable Long productId) {
        return productService.getProductById(productId);
    }
    @GetMapping("/get")
    public ResponseEntity<List<ProductResponseDTO>> getProductsController() {
        return productService.getAllProduct();
    }
}
