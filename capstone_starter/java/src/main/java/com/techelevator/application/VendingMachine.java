package com.techelevator.application;

import com.techelevator.models.MachineRestocker;
import com.techelevator.models.VendableItem;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
    public void run() {
// ****************************************CALL OUR MAP OR LIST HERE**********************************
        List<VendableItem> InventoryItemList = MachineRestocker.stockTheVendingMachine();

// ********************************************************************************
        while (true) {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();


            if (choice.equals("display")) {

                for (VendableItem item : InventoryItemList) {
                    System.out.println(item);
                }


            } else if (choice.equals("purchase")) {
                UserOutput.displayFeedMoneyMessage();
                //add user input method that takes in the line

            } else if (choice.equals("exit")) {
                System.out.println("Good Bye!");
                break;
            }
        }
    }

}
