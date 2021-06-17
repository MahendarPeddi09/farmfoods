package com.farmfoods.server.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDTO {
    private String userName;

    private String name;

    private String email;

    private String phoneNo;

    private String password;

    private Boolean isActive;

    private String role;
}
