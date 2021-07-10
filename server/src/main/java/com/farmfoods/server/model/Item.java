package com.farmfoods.server.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String displayName;
    private String unit;
    private String category1;
    private String category2;
    private String variety;
    private BigDecimal price;
    private LocalDate packedDate;
    private LocalDate expiryDate;
    private Long producerId;
    private BigDecimal quantity;
    @Column(columnDefinition = "TINYINT", length = 1)
    private Boolean isAvailable;
    @Column(columnDefinition = "TINYINT", length = 1)
    private Boolean isActive;
    private Long totalRatings;
    private Float rating;

}
