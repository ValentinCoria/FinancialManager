package com.valentin.model;

public class Transaction {
    private double amount;
    private String details;

    public Transaction(double amount, String details){
        this.amount = amount;
        this.details = details;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
