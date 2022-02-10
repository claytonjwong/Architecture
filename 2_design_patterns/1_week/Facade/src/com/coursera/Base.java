package com.coursera;

import java.math.BigDecimal;

public class Base implements IAccount {
    private static int nextAvailableId = 1;
    private int id;
    private int balance;
    public Base(int initAmount) {
        id = nextAvailableId++;
        balance = initAmount;
    }
    public String getName() {
        return "Base"; // TODO: implement me
    }
    public int getAccountId() { return id; }
    public int getBalance() { return balance; }
    public void deposit(int amount) { this.balance += amount; }
    public void withdraw(int amount) { this.balance -= amount; }
    public boolean transfer(IAccount toAccount, int amount) {
        if (balance < amount || toAccount == null)
            return false;
        withdraw(amount);
        toAccount.deposit(amount);
        return true;
    }
}
