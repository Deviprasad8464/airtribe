package com.entity;

import com.interfaces.Payable;

public class Bill implements Payable {
    private double amount;

    public Bill(double amount)
    {
        this.amount=amount;
    }

    @Override
    public double calculateBill()
    {
        double tax=amount*0.18;
        return amount+tax;
    }
}
