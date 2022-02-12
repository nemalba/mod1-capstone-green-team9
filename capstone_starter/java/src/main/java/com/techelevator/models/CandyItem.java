package com.techelevator.models;

import java.math.BigDecimal;

public class CandyItem extends  VendableItem{

    public CandyItem(String identifier, String name, BigDecimal price) {
        super(identifier, name, price);
        this.setQuantity(5);


    }
}
