package com.farmfoods.server.service.impl;

import com.farmfoods.server.mapper.ItemMapper;
import com.farmfoods.server.dto.ItemDTO;
import com.farmfoods.server.model.Item;
import com.farmfoods.server.repository.ItemRepository;
import com.farmfoods.server.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {


    @Autowired
    ItemRepository itemRepository;

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<ItemDTO> getAllItems() {
        List<Item> items = itemRepository.findAll();
        return itemMapper.itemsToItemDtos(items);
    }
}