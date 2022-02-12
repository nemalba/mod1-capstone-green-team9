package com.techelevator.models;



import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class VendableItem {


    // *********************************************Variables******************************************************
    private String identifier;  // slot number for vending machine
    private String name;
    private BigDecimal price;
    private int quantity = 5;


// *********************************************Constructors******************************************************

    public VendableItem(String identifier, String name, BigDecimal price) {
        this.identifier = identifier;
        this.name = name;
        this.price = price;
        this.quantity = 5;
    }

    public VendableItem() {
    }

    // ***************************************Getters and Setters***************************************************


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {

      //Example from Nema for formatting String  vvv
          //  return String.format("%s\t%3d\t%s", fullName, relativeScore, testScore);
        //return String.format("%s\t%3\t%s", identifier + ", " + name + ", " + price + ", " + quantity + "\n");

        System.out.println();

      // return (identifier + ", " + name + ", " + price + ", " + quantity );
        return (identifier + ", " + name + ", " + price + ", " + quantity );
    }
}
