package com.techelevator.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MachineRestocker {

    public static List<VendableItem> stockTheVendingMachine() {

        List<VendableItem> inventoryList = new ArrayList<>();
        File inventoryFile = new File("vendingmachine.csv");
        Scanner lineReader = null;
        try {
            lineReader = new Scanner(inventoryFile);
        } catch (FileNotFoundException e) {
            System.out.println("Oh snap the file is missing!");
        }


        do {

            // read file and separate into array

            String itemToCreate = lineReader.nextLine();
            String[] attributeArray = itemToCreate.split("\\|");

            //Create objects from Array and add to list
            if (attributeArray[3].equals("Gum")) {
                BigDecimal price = new BigDecimal(attributeArray[2]);
                GumItem placeHolder = new GumItem(attributeArray[0], attributeArray[1], price);
                inventoryList.add(placeHolder);

            } else if (attributeArray[3].equals("Candy")) {
                BigDecimal price = new BigDecimal(attributeArray[2]);
                CandyItem placeHolder = new CandyItem(attributeArray[0], attributeArray[1], price);
                inventoryList.add(placeHolder);

            }  else if (attributeArray[3].equals("Beverage")) {
                BigDecimal price = new BigDecimal(attributeArray[2]);
                BeverageItem placeHolder = new BeverageItem(attributeArray[0], attributeArray[1], price);
                inventoryList.add(placeHolder);

            } else if (attributeArray[3].equals("Chip")) {
                BigDecimal price = new BigDecimal(attributeArray[2]);
                ChipItem placeHolder = new ChipItem(attributeArray[0], attributeArray[1], price);
                inventoryList.add(placeHolder);
            }

        } while (lineReader.hasNextLine());

        return inventoryList;
    }


}
