package com.farmfoods.server.mapper;

import com.farmfoods.server.dto.ItemDTO;
import com.farmfoods.server.model.Item;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring",uses = {})
public interface ItemMapper {

    ItemDTO itemToItemDto(Item item);
    Item itemDtoToItem(ItemDTO itemDTO);

    List<ItemDTO> itemsToItemDtos(List<Item> items);
    List<Item> itemDTOsToItems(List<ItemDTO> itemDTOs);
}
