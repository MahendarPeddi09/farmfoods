package com.farmfoods.server.service;

import com.farmfoods.server.dto.ItemDTO;

import java.util.List;


public interface ItemService {

    List<ItemDTO> getAllItems();
}
