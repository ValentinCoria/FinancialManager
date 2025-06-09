package com.valentin.service;

import com.valentin.model.Transaction;

import java.util.List;

public class TransactionService {
    public double calculateTotal(List<Transaction> transactions){
        return transactions.stream()
                .mapToDouble(Transaction::getAmount)
                .sum();
    }
}
