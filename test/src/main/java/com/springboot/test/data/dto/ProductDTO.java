package com.springboot.test.data.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ProductDTO {

    private String name;

    private Integer price;
    private Integer stock;


}
