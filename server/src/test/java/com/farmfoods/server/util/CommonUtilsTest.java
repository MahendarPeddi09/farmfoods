package com.farmfoods.server.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonUtilsTest {

    @Test
    void getTotalAmount() {

        CommonUtils commonUtils = new CommonUtils();
        assertEquals(commonUtils.getTotalAmount(1,1 ,1),1);

    }
}