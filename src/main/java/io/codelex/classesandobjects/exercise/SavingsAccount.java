package io.codelex.classesandobjects.exercise;

import java.util.Scanner;

public class SavingsAccount {
    private double interestRate;
    private double balance;
    private double totalDeposited;
    private double totalWithdrawn;

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public double getTotalDeposited() {
        return totalDeposited;
    }

    public double getTotalWithdrawn() {
        return totalWithdrawn;
    }


    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void withdrawal(double money){
        this.balance -= money;
        this.totalWithdrawn +=money;
    }
    public void deposit(double money){
        this.balance += money;
        this.totalDeposited +=money;
    }
    public void addMonthlyInterestRate(){
        double monthlyRate = this.interestRate/12;
        this.balance = this.balance + (monthlyRate*balance);

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How much money is in the account?: ");
        SavingsAccount person1 = new SavingsAccount(input.nextDouble());
        System.out.print("Enter the annual interest rate: ");
        person1.setInterestRate(input.nextDouble());
        System.out.print("How long has the account been opened? ");
        int months = input.nextInt();
        for (int i = 1; i <= months; i++){
            System.out.print("Enter amount deposited for month:"+i+": ");
            person1.deposit(input.nextDouble());
            System.out.print("Enter amount withdrawn for month:"+i+": ");
            person1.withdrawal(input.nextDouble());
            person1.addMonthlyInterestRate();

        }
        System.out.printf("Total deposited: $%,.2f %n" , person1.getTotalDeposited());
        System.out.printf("Total withdrawn: $%,.2f %n" , person1.getTotalWithdrawn());
        System.out.printf("Interest earned: $%,.2f %n" , person1.getBalance()-person1.getTotalDeposited()-person1.getTotalWithdrawn());
        System.out.printf("Ending balance: $%,.2f %n" , person1.getBalance());

    }
}
