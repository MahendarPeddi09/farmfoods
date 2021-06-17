package com.farmfoods.server.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class ItemDTO implements Serializable {
    public Long id;
    private String name;
    private String displayName;
    private String category1;
    private String category2;
    private String variety;
    private BigDecimal price;
    private LocalDate packedDate;
    private LocalDate expiryDate;
    private Long producerId;
    private Boolean active;
    private Long totalRatings;
    private Float rating;
}
