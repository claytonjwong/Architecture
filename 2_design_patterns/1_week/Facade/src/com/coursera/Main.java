package com.coursera;

public class Main {

    public static void main(String[] args) {
        BankService bankService = new BankService();
        int checking = bankService.createNewAccount("checking", 100);
        int savings = bankService.createNewAccount("savings", 100);
        int investment = bankService.createNewAccount("investment", 100);
        System.out.println("Initial account balances...");
        bankService.printAccountBalances();
        System.out.println("\n\nTransferring $50 from Checking to Savings...");
        bankService.transferMoney(checking, savings, 50);
        bankService.printAccountBalances();
        System.out.println("\n\nTransferring $150 from Savings to Investment...");
        bankService.transferMoney(savings, investment, 150);
        bankService.printAccountBalances();
    }
}

/*
Initial account balances...
Checking: 100
Savings: 100
Investment: 100


Transferring $50 from Checking to Savings...
Checking: 50
Savings: 150
Investment: 100


Transferring $150 from Savings to Investment...
Checking: 50
Savings: 0
Investment: 250
*/
