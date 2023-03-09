package com.springboot.test.data.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class ProductResponseDTO {
    private Long number;

    private String name;


    private Integer stock;

    private Integer price;

}
