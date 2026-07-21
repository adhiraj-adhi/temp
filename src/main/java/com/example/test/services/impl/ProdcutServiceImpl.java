package com.example.test.services.impl;

import com.example.test.data.ProductRepository;
import com.example.test.dtos.ProductRequestDTO;
import com.example.test.dtos.ProductResponseDTO;
import com.example.test.mapper.ProductMapper;
import com.example.test.models.Product;
import com.example.test.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProdcutServiceImpl implements ProductService
{
    public ProductRepository productRepository;
    public ProdcutServiceImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    public ResponseEntity<ProductResponseDTO> createProduct(ProductRequestDTO productRequestDTO){
        Product product = ProductMapper.productRequestDtoToProduct(productRequestDTO);
        Product savedProduct = productRepository.save(product);
        ProductResponseDTO productResponseDTO = ProductMapper.productToProductResponseDTO(product);
        if (savedProduct!=null) {
            productResponseDTO.setMessage("Product Created Successfully!!");
            return new ResponseEntity<>(productResponseDTO,HttpStatus.CREATED);
        }
        productResponseDTO.setMessage("Failed To Create Product!!");
        return new ResponseEntity<>(productResponseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
