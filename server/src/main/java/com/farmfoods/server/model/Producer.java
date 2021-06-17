package com.farmfoods.server.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Producer implements Serializable {

    @Id
    private Long id;
    private String name;
    private String description;
    private String about;
    private String email;
    private String phoneNo1;
    private String phoneNo2;
    private String address1;
    private String address2;
    private String nearBy;
    private String ara;
    private String district;
    private String state;
    private String pincode;
    private String latitude;
    private String longitude;
    private Long totalRatings;
    private Float avgRating;

}
