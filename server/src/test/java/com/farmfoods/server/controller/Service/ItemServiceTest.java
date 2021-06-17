package com.farmfoods.server.controller.Service;

import com.farmfoods.server.model.Item;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ItemServiceTest {

    List<Item> items = new ArrayList<>();

    @Before
    void prepareData(){
        items.add(new Item());
    }

    @Test
    void getallItemsTest(){

    }
}
