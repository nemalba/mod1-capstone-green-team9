package com.techelevator.models;

import java.math.BigDecimal;

public enum MoneyBills {
    ONE_DOLLAR(new BigDecimal(1.00)), TWO_DOLLAR(new BigDecimal(2.00)), FIVE_DOLLAR(new BigDecimal(5.00)), TEN_DOLLAR(new BigDecimal(10));

    //For each coin we need to know its value
    private BigDecimal value;


    MoneyBills(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

//    public BigDecimal feedMoney(){
//       int total = 0;
//
//     //   BigDecimal moneyProvided = 0;
//
//    }

}
