package com.farmfoods.server.service.impl;

import com.farmfoods.server.dto.ItemDTO;
import com.farmfoods.server.model.Item;
import com.farmfoods.server.repository.ItemRepository;
import com.farmfoods.server.service.ItemService;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
@ExtendWith(SpringExtension.class)
public class ItemServiceImplTest {


    ItemService itemService;

    @Mock
    ItemRepository mockItemRepository;

    @BeforeEach
    void setup(){

       itemService = new ItemServiceImpl();
    }


    @Test
    @DisplayName("Test should save item successfully")
    void shouldCreateANewItem() {


        ItemDTO itemDTO = new ItemDTO();

        Item item = new Item();

        item.setId(1L);


        Mockito.when(mockItemRepository.save(Mockito.any(Item.class))).thenReturn(item);

        ItemDTO itemDTO1 = itemService.save(itemDTO);


        assertEquals(itemDTO1.getId(), item.getId());

    }

    @Test
    void update() {
    }

    @Test
    void get() {
    }

    @Test
    void delete() {
    }

    @Test
    void getAllItems() {
        List<Item> itemList = new LinkedList<>();
        itemList.add(new Item());
        itemList.add(new Item());
        Mockito.when(mockItemRepository.findAll()).thenReturn(itemList);
        itemService.getAllItems();
        Mockito.verify(mockItemRepository,Mockito.times(1)).findAll();
        //assertEquals(2,itemService.getAllItems());
    }
}