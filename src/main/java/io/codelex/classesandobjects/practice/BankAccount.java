package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.


import java.text.DecimalFormat;

public class BankAccount {
    public String name;
    public double balance;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        this.balance += amount;
    }

    public final void withdraw(double amount) {
        this.balance -= amount;
    }

    public String toString() {
        if (this.balance < 0) {
            return this.name + ",-$" + df.format(this.balance * -1);
        } else {
            return this.name + ",$" + df.format(this.balance);
        }
    }

    public static void main(String[] args) {
        BankAccount benben = new BankAccount("Benson", 15.25);
        System.out.println(benben.toString());
    }

}
