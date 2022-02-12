package com.techelevator.models;

import java.math.BigDecimal;

public class ChipItem extends VendableItem{

    public ChipItem(String identifier, String name, BigDecimal price) {
        super(identifier, name, price);
        this.setQuantity(5);


    }


}
