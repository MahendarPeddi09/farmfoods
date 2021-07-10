package com.farmfoods.server.service;

import com.farmfoods.server.dto.ItemDTO;

import java.util.List;


public interface ItemService {

    ItemDTO save(ItemDTO itemDTO);
    ItemDTO update(ItemDTO itemDTO);
    ItemDTO get(Long id);
    void delete(Long id);
    List<ItemDTO> getAllItems();
}
