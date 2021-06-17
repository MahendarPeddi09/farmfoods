package com.farmfoods.server.controller;

import com.farmfoods.server.dto.ItemDTO;
import com.farmfoods.server.model.Item;
import com.farmfoods.server.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {

    @Autowired
    ItemService itemService;

    @RequestMapping(value = "/items/search", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ItemDTO> searchItems(@RequestParam(value = "name") String name){
        return null;
    }

    @RequestMapping(value = "/items", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ItemDTO> getAllItems(){
        List<ItemDTO> itemDTOS = itemService.getAllItems();
        return itemDTOS;
    }

}
