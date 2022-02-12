package com.techelevator.models;

import java.math.BigDecimal;

public class BeverageItem extends VendableItem{

    public BeverageItem(String identifier, String name, BigDecimal price) {
        super(identifier, name, price);
        this.setQuantity(5);


    }
}
