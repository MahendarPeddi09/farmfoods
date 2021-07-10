package com.farmfoods.server.util;

public class CommonUtils {

    public int getTotalAmount(int amount, int quantity, int discount){

        return quantity * amount * discount;
    }
}
