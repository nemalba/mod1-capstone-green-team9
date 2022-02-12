package com.techelevator.models;

import java.math.BigDecimal;

public class GumItem extends VendableItem{

    public GumItem(String identifier, String name, BigDecimal price) {
        super(identifier, name, price);
        this.setQuantity(5);


    }


}
