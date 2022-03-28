package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private int dimensions;
    private int numberOfCopies;
    private double costPerCopy;

    public Poster(int fee, int dimensions, int numberOfCopies, double costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    @Override
    public int cost() {
        return (int) (numberOfCopies * costPerCopy);
    }

    @Override
    public String toString() {
        return super.toString() +
                " Poster ad : dimensions: " + dimensions
                + " number of copies : " + numberOfCopies
                + " cost per copy : " + costPerCopy;
    }
}
