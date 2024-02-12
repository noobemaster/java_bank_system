
package javaapp;


public class account {
    // Account class - represents a bank account
    private static String accountNumber;
    private double balance;
    public account(String account, double balance) {
        this.accountNumber = account;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
