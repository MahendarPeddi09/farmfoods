package com.farmfoods.server.controller;

import com.farmfoods.server.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class CustomerController {


    @GetMapping(value ="/")
    public List<String> findAllCustomer(){
        return null;
    }
}
