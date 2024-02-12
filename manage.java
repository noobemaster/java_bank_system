
package javaapp;

    // CustomerManagement class - manages customer information and accounts
public class manage {
    //agregetion relationship
    private final customer customer;
    private static account account;
    public  manage(customer customer, account account) {
        this.customer = customer;
        this.account = account;
    }
    public void getDetails() {
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Balance: $" + account.getBalance());
    }
    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Deposit of $" + amount + " successful.");
    }
    public void withdraw(double amount) {
        account.withdraw(amount);
        System.out.println("Withdrawal of $" + amount + " successful.");
    }
}
