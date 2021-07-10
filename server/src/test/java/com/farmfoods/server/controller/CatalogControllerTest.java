package com.farmfoods.server.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(CatalogController.class)
public class CatalogControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void TestSearchItemsApi(){

    }

    @Test
    void searchItems() {
    }

    @Test
    void getAllItems() {
    }
}
