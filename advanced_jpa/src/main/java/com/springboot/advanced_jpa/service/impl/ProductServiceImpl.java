package com.springboot.advanced_jpa.service.impl;

import com.springboot.advanced_jpa.data.dao.ProductDAO;
import com.springboot.advanced_jpa.data.dto.ProductDTO;
import com.springboot.advanced_jpa.data.dto.ProductResponseDTO;
import com.springboot.advanced_jpa.data.entity.Product;
import com.springboot.advanced_jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public ProductResponseDTO getProduct(Long number) {
        Product product = productDAO.selectProduct(number);

        ProductResponseDTO productResponseDTO = new ProductResponseDTO();
        productResponseDTO.setName(product.getName());
        productResponseDTO.setPrice(product.getPrice());
        productResponseDTO.setStock(product.getStock());

        return productResponseDTO;
    }

    @Override
    public ProductResponseDTO saveProduct(ProductDTO productDTO) {

        Product product = new Product();

        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setStock(productDTO.getStock());
        product.setCreateAt(LocalDateTime.now());
        product.setUpdateAt(LocalDateTime.now());

        Product saveProduct = productDAO.insertProduct(product);

        ProductResponseDTO productResponseDTO = new ProductResponseDTO();
        productResponseDTO.setName(saveProduct.getName());
        productResponseDTO.setPrice(saveProduct.getPrice());
        productResponseDTO.setStock(saveProduct.getStock());

        return productResponseDTO;
    }

    @Override
    public ProductResponseDTO changeProductName(Long number, String name) throws Exception {
        Product changedProduct = productDAO.updateProductName(number, name);

        ProductResponseDTO productResponseDTO = new ProductResponseDTO();
        productResponseDTO.setName(changedProduct.getName());
        productResponseDTO.setPrice(changedProduct.getPrice());
        productResponseDTO.setStock(changedProduct.getStock());

        return productResponseDTO;
    }

    @Override
    public void deleteProduct(Long number) throws Exception {
        productDAO.deleteProduct(number);
    }
}
