package io.codelex.oop.computers;

public class ComputerTest {
    public static void main(String[] args) {
        Computer pc1 = new Computer("i5-4590", "8gb", "GTX 1060", "Asus", "BFG9000");
        Computer pc2 = new Computer("i9-9900k", "32gb", "GTX 3070", "Msi", "Potato");
        Laptop laptop1 = new Laptop("Ryzen 5", "8gb", "RTX 3050", "Lenovo", "IdeaPad ", "Li-Ion");
        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(laptop1);

    }
}
