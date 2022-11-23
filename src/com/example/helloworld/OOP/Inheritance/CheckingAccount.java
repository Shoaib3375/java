package com.example.helloworld.OOP.Inheritance;

public class CheckingAccount {
    private final String accountNumber;
    private int balance;

    public CheckingAccount(int initialBalance, String accountNumber){
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount){
        this.balance += amount;
        System.out.println("Depositing" + amount + " into account " + accountNumber);
        System.out.println("");
    }
    public void withdraw(int amount){
        System.out.println("Withdrawing " + amount + " into account " + accountNumber);
        if (amount > balance){
            System.out.println("insufficient funds. ");
        }else {
            this.balance -= amount;
            System.out.println("New Balance: " + balance);
        }
        System.out.println("");
    }
    public int getBalance(){
        return balance;
    }
}
