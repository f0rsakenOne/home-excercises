package io.codelex.classesandobjects.practice;

public class AccountTest {
    public static void main(String[] args){
        Account a = new Account("A account",100.00);
        Account b = new Account("B account",0);
        Account c = new Account("C account",0);

        System.out.println("Initial state");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Account.transfer(a,b,150);
        Account.transfer(b,c,25);

        System.out.println("Final state");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
