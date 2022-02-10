package com.coursera;

public interface IAccount {
    public int getAccountId();
    public int getBalance();
    public String getName();
    public void deposit(int amount);
    public void withdraw(int amount);
    public boolean transfer(IAccount toAccount, int amount);
}
