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
    public ItemDTO save(ItemDTO itemDTO) {

        if(itemDTO != null){
            Item item = itemRepository.save(itemMapper.itemDtoToItem(itemDTO));
            itemDTO = itemMapper.itemToItemDto(item);
        }

        return itemDTO;
    }

    @Override
    public ItemDTO update(ItemDTO itemDTO) {
        return null;
    }

    @Override
    public ItemDTO get(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<ItemDTO> getAllItems() {
        List<Item> items = itemRepository.findAll();
        return itemMapper.itemsToItemDtos(items);
    }


}