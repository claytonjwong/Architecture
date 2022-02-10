package com.coursera;

import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer, IAccount> bankAccounts;
    public BankService() {
        bankAccounts = new Hashtable<Integer, IAccount>();
    }
    public int createNewAccount(String type, int initAmount) {
        IAccount account = null;
        switch (type) {
            case "checking":
                account = new Checking(initAmount);
                break;
            case "savings":
                account = new Savings(initAmount);
                break;
            case "investment":
                account = new Investment(initAmount);
                break;
        }
        if (account != null) {
            bankAccounts.put(account.getAccountId(), account);
            return account.getAccountId();
        }
        return -1;
    }
    public boolean transferMoney(int from, int to, int amount) {
        IAccount fromAccount = bankAccounts.get(from);
        IAccount toAccount = bankAccounts.get(to);
        if (fromAccount == null || toAccount == null)
            return false;
        return fromAccount.transfer(toAccount, amount);
    }
    public void printAccountBalances() {
        bankAccounts.forEach((id, account) -> {
            System.out.println(account.getName() + ": " + account.getBalance());
        });
    }
}
