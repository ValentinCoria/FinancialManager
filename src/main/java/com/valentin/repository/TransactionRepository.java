package com.valentin.repository;

import com.valentin.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private List<Transaction> transactions = new ArrayList<>();

    public void save(Transaction transaction) {
        transactions.add(transaction);
    }
    public List<Transaction> findAll() {
        return transactions;
    }
}
