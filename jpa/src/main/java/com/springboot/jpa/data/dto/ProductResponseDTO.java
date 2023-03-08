package com.springboot.jpa.data.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
public class ProductResponseDTO {
    private String name;

    private Integer stock;

    private Integer price;

}
