package com.springboot.advanced_jpa.controller;

import com.springboot.advanced_jpa.data.dto.ChangeProductNameDTO;
import com.springboot.advanced_jpa.data.dto.ProductDTO;
import com.springboot.advanced_jpa.data.dto.ProductResponseDTO;
import com.springboot.advanced_jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity<ProductResponseDTO> getProduct(Long number) {
        ProductResponseDTO productResponseDTO = productService.getProduct(number);

        return ResponseEntity.status(HttpStatus.OK).body(productResponseDTO);
    }

    @PostMapping()
    public ResponseEntity<ProductResponseDTO> createProduct(@RequestBody ProductDTO productDTO) {
        ProductResponseDTO productResponseDTO = productService.saveProduct(productDTO);

        return ResponseEntity.status(HttpStatus.OK).body(productResponseDTO);
    }

    @PutMapping()
    public ResponseEntity<ProductResponseDTO> changeProductName(
            @RequestBody ChangeProductNameDTO changeProductNameDTO) throws Exception {
        ProductResponseDTO productResponseDTO = productService.changeProductName(
                changeProductNameDTO.getNumber(),
                changeProductNameDTO.getName()
        );

        return ResponseEntity.status(HttpStatus.OK).body(productResponseDTO);
    }

    @DeleteMapping()
    public ResponseEntity<String> deleteProduct(Long number) throws Exception {
        productService.deleteProduct(number);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }

}
