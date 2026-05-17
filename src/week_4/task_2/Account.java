package week_4.task_2;

public class Account {
    private double balance;
    private Customer customer;

    public Account(Customer customer) {
        this.balance = 0.0;
        this.customer = customer;
    }

    public Account(Customer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
}
