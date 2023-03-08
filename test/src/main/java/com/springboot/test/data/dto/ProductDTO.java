package com.springboot.test.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
public class ProductDTO {

    private String name;

    private Integer stock;

    private Integer price;

}
