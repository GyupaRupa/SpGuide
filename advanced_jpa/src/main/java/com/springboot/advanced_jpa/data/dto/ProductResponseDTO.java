package com.springboot.advanced_jpa.data.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ProductResponseDTO {
    private String name;

    private Integer stock;

    private Integer price;

}
