package com.techelevator.ui;

import com.techelevator.models.MachineRestocker;

import java.math.BigDecimal;
import java.util.Map;


/**
 * Responsibilities: This class should handle formatting and displaying ALL
 * messages to the user
 * 
 * Dependencies: None
 */
public class UserOutput
{

    public static void displayMessage(String message)
    {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    public static void displayHomeScreen()
    {
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                      Home");
        System.out.println("***************************************************");
        System.out.println();
    }


    public static void displayFeedMoneyMessage(){
        System.out.println();
        System.out.println("********************************");
        System.out.println("Please enter the money to pay for your purchase in dollars:");
        System.out.println("1 for 1$, 2 for 2$, 5 for $5, 10 for $10");

    }





}
