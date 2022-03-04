package io.codelex.classesandobjects.exercise;

public class Product {
    private final String name;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String name,double priceAtStart, int amountAtStart){
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }
    public  void printProduct(){
        System.out.printf("%s, %.2f EUR, %d units%n",name,priceAtStart,amountAtStart);
    }

    public void changePrice(double newPrice){
        this.priceAtStart = newPrice;
    }
    public void changeQuantity(int newQuantity){
        this.amountAtStart = newQuantity;
    }


}
